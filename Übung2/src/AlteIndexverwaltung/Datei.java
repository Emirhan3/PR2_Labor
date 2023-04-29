package AlteIndexverwaltung;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Datei {
	
	private final int SATZLAENGE = 10;
	private int aktuell;
	private String dateiname = "Indexdatei.txt";
	private RandomAccessFile eineStammdatei;

	
	public Datei() {
		
	}
	
	
	public void speichereSatz(String satz, int index) {
		
		if(index< SATZLAENGE) {
			
		}
	}
	
	public String leseSatz(int index) {
		return "";
		
	}
	
	public void oeffneDatei(String name) {

	
	}
	
	public void schliesseDatei() throws IOException {
		eineStammdatei.close();
	}
	
	public int gibAnzahlDatensaetze() {
		return 0;
	}
	
	private void positioniereAufSatz(int index) {
		
	}
	
	private String readFixedString(int laenge) {
		return "";
	}
	
	private void writeFixedString(String einDatensatz, int laenge) {
		
	}
		
}
