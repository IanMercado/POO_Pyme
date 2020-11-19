public class Main {

	public static void main(String[] args) {

		Impresora impresora = new Impresora();
		impresora.marca="Epson";
		impresora.modelo="TX135";
		impresora.color="Color"; //quizas deberia ser un boolean
		impresora.imprimir();

	}

	// PRUEBA: Impresora impresora=new Impresora("Epson");

}
