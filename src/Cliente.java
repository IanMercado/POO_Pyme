import java.util.Scanner;

public class Cliente {

	Scanner sc = new Scanner(System.in);

	private String nombre;
	private String apellido;
	private int dni;
	private int direccion;
	private String DatosCliente;

	public Cliente() {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
	}

	public void DatosCliente() {
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();

		System.out.println("Apellido: ");
		String apellido = sc.nextLine();

		System.out.println("DNI: ");
		String dni = sc.nextLine();

		System.out.println("Dirección: ");
		String direccion = sc.nextLine();

		DatosCliente = nombre + " " + apellido;
		System.out.println("\nHola " + DatosCliente + ". Gracias por confiar en nosotros!"
				+ "\nTe mostraremos a continuación nuestro catálogo de productos:\n");

	}

}
