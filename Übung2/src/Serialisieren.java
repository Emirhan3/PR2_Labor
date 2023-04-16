import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serialisieren {

	public static void main(String[] args) {
		
		Beispiel b = new Beispiel("Random Firma", "Random Adresse","Sparkasse");
		String datei = "Beispiel.xml";
		File f = new File(datei);
		
		try(XMLEncoder enc = new XMLEncoder(new FileOutputStream(datei))) {
			
			enc.writeObject(b);
			
		}catch(IOException exception) {
			exception.printStackTrace();
		}
		
		try(XMLDecoder dec = new XMLDecoder(new FileInputStream(datei))) {
			
			Beispiel neuDL = (Beispiel) dec.readObject();
			System.out.println("Firmenname: "+ neuDL.getFirmenname() + "\n Adresse: " + neuDL.getAdresse() + "\n Bankverbindung: " + neuDL.getBankverbindung());
			
		}catch(IOException exception2) {
			
			exception2.printStackTrace();
		}
		
		
		
	}

}
