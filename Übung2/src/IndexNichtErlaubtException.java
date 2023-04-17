
public class IndexNichtErlaubtException extends Exception{
	
	private int index;
	
	public IndexNichtErlaubtException(String meldung, int index) {
		super(meldung);
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
	
	@Override
	public String toString() {
		
		return "Der Index " + getIndex() + " mit dem Problem: "+ getMessage();
	}
	
}
