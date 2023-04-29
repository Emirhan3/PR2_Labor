import java.io.IOException;
import java.util.Scanner;

public class IndexUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Index indexDatei = new Index();
		Datei stammDatei = new Datei();
		Scanner sc = new Scanner(System.in);
		
		try {
			indexDatei.ladeIndexDatei();
		}
		catch(IOException e)
		{
			System.err.println("INFO - Dateien nicht vorhanden - Erzeuge Beispiel!");
			
			int idx = 0;
			try {
				stammDatei.oeffneDatei("stammdatei.txt");
				
				indexDatei.erzeugeEintrag(6, idx);
				stammDatei.speichereSatz("Satz 1", idx);
				
				idx++;
				indexDatei.erzeugeEintrag(1, idx);
				stammDatei.speichereSatz("Satz 2", idx);
				
				idx++;
				indexDatei.erzeugeEintrag(3, idx);
				stammDatei.speichereSatz("Satz 3", idx);
				
				idx++;
				indexDatei.speichereIndexDatei();
				stammDatei.schliesseDatei();
				
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		indexDatei.gibIndextabelleAus();
		
		try {
			stammDatei.oeffneDatei("stammdatei.txt");
			
			while(true) {
				System.out.print("Bitte geben Sie einen Schluessel ein:");
				String schluessel = sc.nextLine();
				
				if(schluessel.isEmpty())
					break;
				
				try {
					int index = indexDatei.gibIndexZuSchluessel(Integer.parseInt(schluessel));
					
					String satz = stammDatei.leseSatz(index);
					
					System.out.println("Der zu " + schluessel + " gewuenschte Satz lautet: ==>" + satz + "<==");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidIndexException e) {
					System.err.println("\n==> Zugriff auf nicht vorhandenen Schluessel: " + e.gibSchluessel() + "<==");
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				
				indexDatei.speichereIndexDatei();
				
				stammDatei.schliesseDatei();
				
				System.err.println("Dateien geschlossen!");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Programm beendet!");
		
	}

}
