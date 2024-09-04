package folhaDePagamento;

public class Horista implements Funcionario {
	int valorhora = 100;
	int quanthora = 80;
	
	
	@Override
	public long id() {
		System.out.println(1109273l);
		return 0;
	}
	
	@Override
	public String nome() {
		System.out.println("Hero");
		return null;
	}
	
	@Override
	public String telefone() {
		System.out.println("55+ 13 998734854");
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
		System.out.println(valorhora*quanthora);
	}

}
