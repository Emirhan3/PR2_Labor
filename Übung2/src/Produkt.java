
public class Produkt {

	private String produktname;
	private double preis;
	
	public Produkt(String produktname, double preis) {
		
		this.produktname = produktname;
		this.preis = preis;
		
	}
	
	public String toString() {
		return "Produktname: " + produktname + " Preis: " + preis;
	}
	
}
