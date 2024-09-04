package att;

public class CadeiraObj {

	public static void main(String[] args) {
		Cadeira cadeira1 = new Cadeira();
		Cadeira cadeira2 = new Cadeira();
		
		cadeira1.setAcento("tem");
		cadeira1.setBracos("tem");
		cadeira1.setMaterial("couro");
		cadeira1.setRodas("5 rodas");
		
		cadeira1.setInclina("Sim");
		cadeira1.setGira("Sim");
		cadeira1.setAnda("Sim");
		cadeira1.setSobeedesce("Sim");
		
		cadeira2.setAcento("tem");
		cadeira2.setBracos("tem");
		cadeira2.setMaterial("metal");
		cadeira2.setRodas("4 rodas");
		
		cadeira2.setInclina("não");
		cadeira2.setGira("não");
		cadeira2.setAnda("não");
		cadeira2.setSobeedesce("não");
		
		System.out.println("————— Objeto 1 —————");
		System.out.println(cadeira1.getAcento());
		System.out.println(cadeira1.getBracos());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getRodas());
		System.out.println(cadeira1.getInclina());
		System.out.println(cadeira1.getGira());
		System.out.println(cadeira1.getAnda());
		System.out.println(cadeira1.getSobeedesce());
		
		System.out.println("————— Objeto 2 —————");
		System.out.println(cadeira2.getAcento());
		System.out.println(cadeira2.getBracos());
		System.out.println(cadeira2.getMaterial());
		System.out.println(cadeira2.getRodas());
		System.out.println(cadeira2.getInclina());
		System.out.println(cadeira2.getGira());
		System.out.println(cadeira2.getAnda());
		System.out.println(cadeira2.getSobeedesce());
		
		
		
		

	}

}
