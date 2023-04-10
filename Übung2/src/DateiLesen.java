import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DateiLesen {

	private static String firmenname;
	private static String adresse;
	private static String bankverbindung;
	private int steuernummer;
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		if(existertDatei(new File("test4.txt"))){
			try(BufferedReader lesen = new BufferedReader(new FileReader("test4.txt"))) {
				
				String zeile = lesen.readLine();
				
				while(zeile != null) {
					System.out.println(zeile);
					zeile = lesen.readLine();
				}
				
			}catch(IOException exception) {
				System.out.println("Fehlermeldung: "+ exception);
			}
		} else {
			System.out.print("Firmennamen eingeben: ");
			firmenname = sc.nextLine();
			System.out.println("Adresse eingeben: ");
			adresse = sc.nextLine();
			System.out.println("Bankverbindung eingeben: ");
			bankverbindung = sc.nextLine();
			
			System.out.println();
			System.out.println("Informationen für die Datei angelegt");
			
			try(BufferedWriter writer = new BufferedWriter(new FileWriter("test4.txt"))) {
				
				writer.write("Firmenname = " + firmenname +"\n");
				writer.write("Adresse = " + adresse + "\n");
				writer.write("Bankverbindung = "+ bankverbindung + "\n");
				
				
			}catch(IOException exception1) {

			System.out.println("Fehlermeldung: "+ exception1);
			
			}
		}
		
		
	}
	
	public static boolean existertDatei(File f) throws IOException {
		
		if(f.exists()) {
			System.out.println("Datei existiert");
			return true;
		}else {
			System.out.println("Datei existiert nicht");
			System.out.println("");
			System.out.println("Neue Datei anlegen");
			f.createNewFile();
			System.out.println(f + " erzeugt");
			return false;
	}
		
		
	}
}
