package folhaDePagamento;

public class PessoaJuridica implements Funcionario {
	int valorbruto = 30000;
	int qimposto = 5700;
	
	
	@Override
	public long id() {
		System.out.println(1109273l);
		return 0;
	}
	
	@Override
	public String nome() {
		System.out.println("Aubrey");
		return null;
	}
	
	@Override
	public String telefone() {
		System.out.println("55+ 13 992348367");
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
		System.out.println(valorbruto-qimposto);
	}

}
