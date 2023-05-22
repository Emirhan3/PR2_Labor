package löschen;

import java.util.HashMap;

public class ShoppingListManager {
    private HashMap<String, Integer> shoppingList;

    public ShoppingListManager() {
        shoppingList = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        if (shoppingList.containsKey(itemName)) {
            // Wenn der Artikel bereits in der Liste vorhanden ist, erhöhe die Menge entsprechend
            quantity += shoppingList.get(itemName);
        }
        shoppingList.put(itemName, quantity);
    }

    public void removeItem(String itemName) {
        shoppingList.remove(itemName);
    }

    public void printList() {
        for (String itemName : shoppingList.keySet()) {
            int quantity = shoppingList.get(itemName);
            System.out.println(itemName + " - " + quantity);
        }
    }
}
