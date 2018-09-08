
import java.util.ArrayList;

public abstract class HondaCivic {
	String trimName;
	String engine;
	String transmission;
	ArrayList <String> options = new ArrayList<String>();
	
	public String getTrim() {
		return trimName;
	}
	public void initOrderMsg() {
		System.out.println("Bought a Honda Civic " + trimName + "...\n");
	}
	
	public void processingOrder() {
		System.out.println("Processing your order for your Honda Civic " + trimName + "...\n");
	}
	
	public void buildOrder() {
		System.out.println("Building your order for your Honda Civic " + trimName + "...\n");
	}
	
	public void deliverOrder() {
		System.out.println("Vroom...Vroom...Your Honda Civic " + trimName + " is being delivered to your nearest dealer.\n");
	}
	
	public String toString() {
		StringBuffer console = new StringBuffer();
		console.append("Honda Civic " + trimName + ": \n");
		console.append(engine + "\n");
		console.append(transmission + "\n");
		console.append("Options:\n");
		for (String option : options) {
			console.append(option + "\n");
		}
		
		return console.toString();
	}
	

}
