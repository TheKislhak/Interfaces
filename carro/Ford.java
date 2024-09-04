package carro;

public class Ford implements Veiculo {
	
	@Override
	public void ligar() {
		System.out.println("O Ford liga.");
	}
	
	@Override
	public void desligar() {
		System.out.println("O Ford desliga.");
	}
	
	@Override
	public void manobrar() {
		System.out.println("O Ford manobra");
	}
	
	@Override
	public void engatar() {
		System.out.println("O Ford engata.");
	}
	
	@Override
	public void acelerar() {
		System.out.println("O Ford acelerra");
	}
	
	@Override
	public void frear() {
		System.out.println("O Ford freaia");
	}

}
