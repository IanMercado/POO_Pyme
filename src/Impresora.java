public class Impresora {

	private String marca;
	private String modelo;
	private String color;

	// PRUEBA: Impresora(String marca) {
	// this.marca=marca;
	// }
	
	
	//constructor
	public Impresora() {
		
		this.marca="Epson";
		this.modelo="TX135";
		this.color="Color";
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
