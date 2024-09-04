package casa;

public class Gamer implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("O computador liga");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O computador reinicia");
	}
	
	@Override
	public void desligar() {
		System.out.println("O computador desliga");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("O computador carrega o sistema operacional");
	}
	
	@Override
	public void abrirAplicativo() {
		System.out.println("O computador abre os aplicativos");
	}
	
	@Override
	public void atualizar() {
		System.out.println("O computador atualiza");
	}

}
