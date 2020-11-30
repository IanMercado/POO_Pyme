import java.util.Scanner;
import java.util.ArrayList; //Importar paquete java util

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Impresora impresora=new Impresora();
	
		Cliente cliente=new Cliente();
//		cliente.DatosCliente();
		
		Producto productos=new Producto("","", 0.1, 1);
//		productos.Listaproductos();
		productos.pedidoCliente();
		
		
		
//		System.out.println("Nombre: ");
//		String nombre=sc.nextLine();
//		
//		System.out.println("Apellido: ");
//		String apellido=sc.nextLine();
//		
//		System.out.println("DNI: ");
//		String dni=sc.nextLine();
//		
//		System.out.println("Dirección: ");
//		String direccion=sc.nextLine();
//		
//		System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nDNI: "+dni+"\nDirección: "+direccion);
		
		
	}

	
	

}
