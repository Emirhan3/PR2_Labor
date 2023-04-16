import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DateiLesen {
	
	private static String datei = "test.txt";
	private static String benutzername;
	private static String passwort;
	private static String firmenname;
	private static String adresse;
	private static String bankverbindung;
	private static int steuernummer;
	
	public DateiLesen(String firmenname, String adresse, String bankverbindung) {
		
		this.firmenname = firmenname;
		this.adresse = adresse;
		this.bankverbindung = bankverbindung;
		
	}
	
	public DateiLesen() {
		
	}


	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		if(existertDatei(new File(datei))){
			try(BufferedReader lesen = new BufferedReader(new FileReader(datei))) {
				
				String zeile = lesen.readLine();
				
				while(zeile != null) {
					System.out.println(zeile);
					zeile = lesen.readLine();
				}
				
			}catch(IOException exception) {
				System.out.println("Fehlermeldung: "+ exception);
			}
		} else {
			System.out.println("Benutzername eingeben: ");
			benutzername = sc.nextLine();
			System.out.println("Passwort eingeben: ");
			passwort = sc.nextLine();
			System.out.print("Firmennamen eingeben: ");
			firmenname = sc.nextLine();
			System.out.println("Adresse eingeben: ");
			adresse = sc.nextLine();
			System.out.println("Bankverbindung eingeben: ");
			bankverbindung = sc.nextLine();
			System.out.println("Steuernummer eingeben: ");
			steuernummer = sc.nextInt();
			
			System.out.println();
			System.out.println("Informationen für die Datei angelegt");
			
			try(BufferedWriter writer = new BufferedWriter(new FileWriter(datei))) {
				
				writer.write("Benutzername = " + benutzername +"\n");
				writer.write("Passwort = " + passwort +"\n");
				writer.write("Firmenname = " + firmenname +"\n");
				writer.write("Adresse = " + adresse + "\n");
				writer.write("Bankverbindung = "+ bankverbindung + "\n");
				writer.write("Steuernummer = "+ steuernummer + "\n");
				
			}catch(IOException exception1) {

			System.out.println("Fehlermeldung: "+ exception1);
			
			}
		}
		
		
	}
	
	public static boolean existertDatei(File f) throws IOException {
		
		if(f.exists()) {
			System.out.println("Datei existiert mit den Inhalten: " + "\n");
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
	
	public static String getFirmenname() {
		return firmenname;
	}


	public static void setFirmenname(String firmenname) {
		DateiLesen.firmenname = firmenname;
	}


	public static String getAdresse() {
		return adresse;
	}


	public static void setAdresse(String adresse) {
		DateiLesen.adresse = adresse;
	}


	public static String getBankverbindung() {
		return bankverbindung;
	}


	public static void setBankverbindung(String bankverbindung) {
		DateiLesen.bankverbindung = bankverbindung;
	}
}
