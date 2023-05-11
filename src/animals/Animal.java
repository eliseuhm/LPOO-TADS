package animals;

public class Animal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.emitirSom();
		animal.moverSe();
	}
	
	private void moverSe() {
		System.out.println("Animal se moveu.");
	}
	
	private void emitirSom() {
		System.out.println("Animal emitiu som.");
	}
}
