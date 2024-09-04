package casa;

public class Principal {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		Home home = new Home();
		
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		gamer.abrirAplicativo();
		gamer.atualizar();
		
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
		home.abrirAplicativo();
		home.atualizar();

	}

}
