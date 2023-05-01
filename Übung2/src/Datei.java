import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Datei {
	private int aktuell;
	private String dateiname = "Stammdatei.txt";
	private int SATZLAENGE = 100;
	private RandomAccessFile eineStammDatei;
	
	public Datei() { }
	
	public Datei(int satzlaenge)
	{
		SATZLAENGE = satzlaenge;
	}
	
	public void speichereSatz(String satz, int index) throws IOException
	{
		positioniereAufSatz(index);
		writeFixedString(satz, SATZLAENGE);
	}
	
	public String leseSatz(int index) throws IOException
	{
		positioniereAufSatz(index);
		
		return readFixedString(SATZLAENGE);
	}
	
	public void oeffneDatei(String name) throws IOException
	{
		if(!name.isBlank())
			dateiname = name;
		
		eineStammDatei = new RandomAccessFile(dateiname, "rw");
	}
	
	public void schliesseDatei() throws IOException
	{
		eineStammDatei.close();
	}
	
	public int gibAnzahlDatensaetze() throws IOException
	{
		return (int) (eineStammDatei.length() / SATZLAENGE);
	}
	
	private void positioniereAufSatz(int index) throws IOException
	{
		if(index * SATZLAENGE * Character.BYTES != aktuell)
		{
			aktuell = index * SATZLAENGE * Character.BYTES;
			eineStammDatei.seek(aktuell);
		}
	} 
	
	private String readFixedString(int laenge) throws IOException
	{	
		StringBuffer satz = new StringBuffer();
	
		while(laenge-- > 0)
			satz.append(eineStammDatei.readChar());
		
		return satz.toString();
	}
	
	private void writeFixedString(String einDatensatz, int laenge) throws IOException
	{
		StringBuffer sb = new StringBuffer(einDatensatz);
		
		while(sb.length() != laenge)
			sb.append('\0');
		
		for(int index = 0; index < laenge; index++) {
			
			eineStammDatei.writeChar(sb.charAt(index));
		}
	}
}
