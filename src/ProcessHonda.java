
public class ProcessHonda {
	HondaFactoryTrim civicTrim;
	
	public ProcessHonda(HondaFactoryTrim civicTrim) {
		this.civicTrim = civicTrim;
	}
	
	public HondaCivic buildCivic(String trim) {
		HondaCivic civic;
		
		civic = civicTrim.createCivic(trim);
		civic.initOrderMsg();
		civic.processingOrder();
		civic.buildOrder();
		civic.deliverOrder();
		
		
		return civic;
		
	}
}
