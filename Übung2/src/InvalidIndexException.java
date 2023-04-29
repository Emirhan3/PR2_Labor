
public class InvalidIndexException extends Exception {
	private int schluessel;

	public InvalidIndexException(int s){
		super("Access to Unknown Index");
		schluessel = s;
	}

	public InvalidIndexException(int s, String fehlermeldung){
		super(fehlermeldung);
		schluessel = s;
	}
	
	public int gibSchluessel() { return schluessel; }
}
