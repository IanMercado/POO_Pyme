public class Impresora {

	String marca;
	String modelo;
	String color;

	// PRUEBA: Impresora(String marca) {
	// this.marca=marca;
	// }
	
	
	//(constructor)
	public Impresora() {
		System.out.println("Se creo un objeto de tipo impresora");
	}

	// Métodos
	public void imprimir() {
		System.out.println("Imprimiendo...");
	}

	public void fotocopiar() {
		System.out.println("Fotocopiando...");
	}

	public void escanear() {
		System.out.println("Escaneando...");
	}

}
