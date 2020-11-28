import java.util.Scanner;
import java.util.ArrayList; //Importar paquete java util

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Impresora impresora=new Impresora();
	
		Cliente cliente=new Cliente();
		cliente.DatosCliente();
		
		//Declarar
		ArrayList<Producto> listaproductos;
		
		//Instanciar
		listaproductos=new ArrayList<Producto>();
			
		//Agregar elementos
		listaproductos.add( new Producto("Procesador","i7-4790K",38.389) );
		listaproductos.add( new Producto("Motherboard","Asus Prime X570-P",19.139) );
		listaproductos.add( new Producto("Memoria RAM","Kingston HyperX Fury",8.998) );
		
		
		//Recorrer ArrayList
		for (int i = 0; i < listaproductos.size(); i++) {
			System.out.println("--> "+listaproductos.get(i).tipo + listaproductos.get(i).descripcion);
		}
		
		
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
