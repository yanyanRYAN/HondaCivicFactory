
public class HondaFactoryTrim {
	
	public HondaCivic createCivic(String trim) {
		HondaCivic civic = null;
		
		if (trim.equalsIgnoreCase("TypeR")) {
			civic = new CivicTypeR();
		} else if (trim.equalsIgnoreCase("Si")) {
			civic = new CivicSi();
		} else if (trim.equalsIgnoreCase("EX")) {
			civic = new CivicEX();
		} else if (trim.equalsIgnoreCase("LX")) {
			civic = new CivicLX();
		}
		
		return civic;
	}
	
}
