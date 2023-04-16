import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serialisieren {

	public static void main(String[] args) {
		
		DateiLesen b1 = new DateiLesen("Random Firma", "Random Adresse", "Sparkasse");
		String datei = "Beispiel2.xml";
		
		try(XMLEncoder enc = new XMLEncoder(new FileOutputStream(datei))) {
			
			enc.writeObject(b1);
			
		}catch(IOException exception) {
			exception.printStackTrace();
		}
		
		try(XMLDecoder dec = new XMLDecoder(new FileInputStream(datei))) {
			
			DateiLesen neuB= (DateiLesen) dec.readObject();
			System.out.println("Firmenname: "+ neuB.getFirmenname() + "\n Adresse: " + neuB.getAdresse() + "\n Bankverbindung: " + neuB.getBankverbindung());
			
		}catch(IOException exception2) {
			
			exception2.printStackTrace();
		}
		
		
		
	}

}
