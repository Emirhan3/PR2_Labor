
public class Firmenadresse {

	private String strasse;
	private int hausnummer;
	private int postleitzahl;
	private String wohnort;
	private String land;
	
	public Firmenadresse(String strasse, int hausnummer, int postleitzahl, String wohnort, String land) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.postleitzahl = postleitzahl;
		this.wohnort = wohnort;
		this.land = land;
	}
	
	public String toString() {
		
		return "Straﬂe: "+ strasse + " - Hausnummer: "+ hausnummer + " - Postleitzahl: "+ postleitzahl + " - Wohnort: "+ wohnort + " - Land: "+ land;
	}
	
	
}
