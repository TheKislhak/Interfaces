package casa;

public class Home implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("A home faz o computador ligar");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("A home faz o computador reiniciar");
	}
	
	@Override
	public void desligar() {
		System.out.println("A home faz o computador desligar");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("A home carrega o sistema operacional");
	}
	
	@Override
	public void abrirAplicativo() {
		System.out.println("A home abre os aplicativos do computador");
	}
	
	@Override
	public void atualizar() {
		System.out.println("A home faz o computador atualiza");
	}

}
