package att;

public class PcObj {

	public static void main(String[] args) {
		Pc pc1 = new Pc();
		Pc pc2 = new Pc();
		
		pc1.setCor("cinza");
		pc1.setMonitor("240hz");
		pc1.setSdd("90g");
		pc1.setPlacadevideo("NVidea");
		
		pc1.setLiga("sim");
		pc1.setDesliga("sim");
		pc1.setTrava("não");
		pc1.setAbreapp("sim");
		
		pc2.setCor("preto");
		pc2.setMonitor("160hz");
		pc2.setSdd("não");
		pc2.setPlacadevideo("AMD");
		
		pc2.setLiga("sim");
		pc2.setDesliga("sim");
		pc2.setTrava("sim");
		pc2.setAbreapp("não");
		
		System.out.println("————— Objeto 1 —————");
		System.out.println(pc1.getCor());
		System.out.println(pc1.getMonitor());
		System.out.println(pc1.getSsd());
		System.out.println(pc1.getPlacadevideo());
		System.out.println(pc1.getLiga());
		System.out.println(pc1.getDesliga());
		System.out.println(pc1.getTrava());
		System.out.println(pc1.getAbreapp());
		
		System.out.println("————— Objeto 2 —————");
		System.out.println(pc2.getCor());
		System.out.println(pc2.getMonitor());
		System.out.println(pc2.getSsd());
		System.out.println(pc2.getPlacadevideo());
		System.out.println(pc2.getLiga());
		System.out.println(pc2.getDesliga());
		System.out.println(pc2.getTrava());
		System.out.println(pc2.getAbreapp());

	}

}
