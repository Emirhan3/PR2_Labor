
import java.util.ArrayList;

public class GenericContainer<T> {
	
    private ArrayList<T> elemente;

    public GenericContainer() {
    	elemente = new ArrayList<T>();
    }

    public void add(T element) {
    	elemente.add(element);
    }

    public T get(int position) {
        return elemente.get(position);
    }

    public void remove(int position) {
    	elemente.remove(position);
    }

    public int size() {
        return elemente.size();
    }

    public int find(T element) {
        return elemente.indexOf(element);
    }
    
    public static void main(String[] args) {
    	
    	GenericContainer<Kunde> kunde = new GenericContainer<Kunde>();
    	Kunde k1 = new Kunde("Emirhan","Sahin");
    	Kunde k2 = new Kunde("Lars","Anton");
    	Kunde k3 = new Kunde("Leon","Max");
    	
    	kunde.add(k1);
    	kunde.add(k2);
    	kunde.add(k3);
  
    	kunde.remove(2);
    	System.out.println(kunde.get(0));
    	System.out.println(kunde.find(k2));
    	
    	GenericContainer<Produkt> produkte = new GenericContainer<Produkt>();
    	Produkt p1 = new Produkt("Tastatur", 29.99);
    	Produkt p2 = new Produkt("Maus",20);
    	Produkt p3 = new Produkt("Laptop",200);
    	
    	produkte.add(p1);
    	produkte.add(p2);
    	produkte.add(p3);
  
    	produkte.remove(2);
    	System.out.println(produkte.get(0));
    	System.out.println(produkte.find(p2));
    	
    	GenericContainer<Rechnung> rechnung = new GenericContainer<Rechnung>();
    	Rechnung r1 = new Rechnung("RE-001",kunde.get(0),produkte.get(0));
    	Rechnung r2 = new Rechnung("RE-001",kunde.get(1),produkte.get(1));

    	rechnung.add(r1);
    	rechnung.add(r2);
    	
    	System.out.println(rechnung.get(0));
    	System.out.println(rechnung.get(1));
    	System.out.println(rechnung.find(r2));
    	
    }
    
}
    


