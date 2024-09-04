package carro;

public class Ferrari implements Veiculo {
	
	@Override
	public void ligar() {
		System.out.println("A Ferrari liga.");
	}
	
	@Override
	public void desligar() {
		System.out.println("A Ferrari desliga.");
	}
	
	@Override
	public void manobrar() {
		System.out.println("A Ferrari manobra");
	}
	
	@Override
	public void engatar() {
		System.out.println("A Ferrari engata.");
	}
	
	@Override
	public void acelerar() {
		System.out.println("A Ferrari acelerra");
	}
	
	@Override
	public void frear() {
		System.out.println("A Ferrari freaia");
	}

}
