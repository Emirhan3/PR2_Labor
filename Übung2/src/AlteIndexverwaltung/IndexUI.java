package AlteIndexverwaltung;
import java.io.IOException;

public class IndexUI {

	public static void main(String[] args) throws IOException, IndexNichtErlaubtException {

		Index i = new Index();
		
		
		i.erzeugeEintrag(3, 3);
		i.erzeugeEintrag(1, 4);
	  System.out.println(i.gibIndexZuSchluessel(1));
		i.gibIndextabelleAus();
		
	}

}
