
public class Kunde {
	
	private String name;
	private String nachname;
	
	public Kunde(String name, String nachname) {
		
		this.name = name;
		this.nachname = nachname;
		
	}
	
	public String toString() {
		return "Name: " + name + " Nachname: " + nachname;
	}

}
