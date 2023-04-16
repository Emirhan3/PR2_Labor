
public class Beispiel {

	private String firmenname;
	private String adresse;
	private String bankverbindung;
	
	
	public Beispiel(String firmenname, String adresse, String bankverbindung) {
		
		this.firmenname = firmenname;
		this.adresse = adresse;
		this.bankverbindung = bankverbindung;
	}
	
	public Beispiel() {
		
	}


	public String getFirmenname() {
		return firmenname;
	}


	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getBankverbindung() {
		return bankverbindung;
	}


	public void setBankverbindung(String bankverbindung) {
		this.bankverbindung = bankverbindung;
	}
	
	
	
}
