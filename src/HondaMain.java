
public class HondaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You're pretty loaded but stupid so you decided to buy a fleet of Honda Civics.\n\n\n");
		
		HondaFactoryTrim trim = new HondaFactoryTrim();
		ProcessHonda process = new ProcessHonda(trim);
		
		HondaCivic civic = process.buildCivic("TypeR");
		System.out.println(civic);
		
		HondaCivic civic2 = process.buildCivic("EX");
		System.out.println(civic2);
		
		HondaCivic civic3 = process.buildCivic("SI");
		System.out.println(civic3);
		
		HondaCivic civic4 = process.buildCivic("LX");
		System.out.println(civic4);
		
		System.out.println("----Order Summary----\n");
		
		System.out.println(civic.toString());
		System.out.println(civic2.toString());
		System.out.println(civic3.toString());
		System.out.println(civic4.toString());
	}

}
