package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class BuchstabenHaeufigkeit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Text ein: ");
        String text = scanner.nextLine().toLowerCase();
        HashMap<Character, Integer> buchstabenHaeufigkeit = new HashMap<>();

        for (char buchstabe : text.toCharArray()) {
            if (Character.isLetter(buchstabe)) {
                // Umlaute behandeln
                if (buchstabe == 'ü') {
                    buchstabe = 'u';
                } else if (buchstabe == 'ö') {
                    buchstabe = 'o';
                } else if (buchstabe == 'ä') {
                    buchstabe = 'a';
                } else if (buchstabe == 'ß') {
                    buchstabe = 's';
                }

                if (buchstabenHaeufigkeit.containsKey(buchstabe)) {
                    buchstabenHaeufigkeit.put(buchstabe, buchstabenHaeufigkeit.get(buchstabe) + 1);
                } else {
                    buchstabenHaeufigkeit.put(buchstabe, 1);
                }
            }
        }

        int gesamtAnzahlBuchstaben = 0;
        for (int anzahlBuchstaben : buchstabenHaeufigkeit.values()) {
            gesamtAnzahlBuchstaben += anzahlBuchstaben;
        }

        System.out.println("Buchstaben-Häufigkeit:");
        
        for (char buchstabe : buchstabenHaeufigkeit.keySet()) {
            int anzahlBuchstaben = buchstabenHaeufigkeit.get(buchstabe);
            double prozentAnteil = (double) anzahlBuchstaben / gesamtAnzahlBuchstaben * 100.0;
            System.out.printf("%c: %.2f%%\n", buchstabe, prozentAnteil);
        }
    }
}

