package Collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PruefungAnmelden {
    public static void main(String[] args) {
    	TreeSet<String> anmeldungen = new TreeSet<>(); // TreeSet für geordnete Matrikelnummern
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Geben Sie Ihre Matrikelnummer ein (oder 'q' zum Beenden): ");
            String matrikelnummer = scanner.nextLine();
            
            if (matrikelnummer.equals("q")) {
                break;
            }
            
            if (anmeldungen.contains(matrikelnummer)) {
                System.out.println("Sie haben sich bereits zur Prüfung angemeldet.");
            } else {
                anmeldungen.add(matrikelnummer);
            }
        }
        
        System.out.println("Anmeldungen geordnet nach Matrikelnummern:");
        for (String matrikelnummer : anmeldungen) {
            System.out.println(matrikelnummer);
        }
        
        scanner.close();
    }
}
