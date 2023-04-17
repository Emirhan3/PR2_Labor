import java.io.RandomAccessFile;

public class Datei {
	
	private int aktuell;
	private String dateiname = "Indexdatei.txt";
	private final int SATZLAENGE = 10;
	private RandomAccessFile eineStammdatei;

	
	public Datei() {
		
	}
	
	
	public void speichereSatz(String satz, int index) {
		
	}
	
	public String leseSatz(int index) {
		return "";
		
	}
	
	public void oeffneDatei(String name) {
		
	}
	
	public void schliesseDatei() {
		
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
