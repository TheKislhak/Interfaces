package folhaDePagamento;

public class Jornada implements Funcionario {
	int salariohora = 100;
	int horastra = 80;
	
	
	@Override
	public long id() {
		System.out.println(1109273l);
		return 0;
	}
	
	@Override
	public String nome() {
		System.out.println("Kel");
		return null;
	}
	
	@Override
	public String telefone() {
		System.out.println("55+ 13 998739845");
		return null;
	}
	
	@Override
	public int matricula() {
		System.out.println("Sim");
		return 0;
	}
	
	@Override
	public String endereco() {
		System.out.println("Farway Town");
		return null;
	}
	
	@Override
	public void calculaSalario() {
		System.out.println(salariohora*horastra);
	}

}
