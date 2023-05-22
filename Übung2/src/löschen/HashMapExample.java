package löschen;

import java.util.HashMap;

public class HashMapExample {
	   public static void main(String[] args) {
	      // Erstelle eine neue HashMap
	      HashMap<String, Integer> scores = new HashMap<>();

	      // Füge Schlüssel-Wert-Paare zur HashMap hinzu
	      scores.put("Alice", 100);
	      scores.put("Bob", 90);
	      scores.put("Charlie", 80);

	      // Zugriff auf den Wert mit dem Schlüssel "Alice"
	      int aliceScore = scores.get("Alice");
	      System.out.println("Alice's Score: " + aliceScore);

	      // Überprüfen, ob die HashMap einen bestimmten Schlüssel enthält
	      boolean hasCharlie = scores.containsKey("Charlie");
	      System.out.println("Does the HashMap contain Charlie? " + hasCharlie);

	      // Iteration durch die Schlüssel-Wert-Paare in der HashMap
	      for (String name : scores.keySet()) {
	         int score = scores.get(name);
	         System.out.println(name + " scored " + score);
	      }
	   }
}

