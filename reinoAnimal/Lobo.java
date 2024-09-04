package reinoAnimal;

public class Lobo implements Animal {
	
	@Override
	public void dormir() {
		System.out.println("O lobo esta dormindo.");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O lobo esta caminhando.");
	}
	
	@Override
	public void correr() {
		System.out.println("O lobo esta correndo.");
	}

	@Override
	public void emitirsom() {
		System.out.println("O lobo uivnado.");
	}

}
