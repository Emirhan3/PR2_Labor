
public class Rechnung {
	
	private String rechnungsnummer;
	private Kunde kunde;
	private Produkt produkt;
	
	public Rechnung(String rechnungsnummer, Kunde kunde, Produkt produkt) {
		
		this.rechnungsnummer = rechnungsnummer;
		this.kunde = kunde;
		this.produkt = produkt;
		
	}
	
	public String toString() {
		return "Rechnungsnummer: " + rechnungsnummer + " Kunde -> " + kunde + " Produkt -> " + produkt;
	}

}
