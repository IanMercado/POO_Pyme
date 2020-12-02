import java.util.Scanner;
import java.util.ArrayList; //Importar paquete java util
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Impresora impresora=new Impresora();
		
		System.out.println("***Bienvenido a nuestra Pyme***\nPor favor complete los siguientes datos");
		
		Cliente cliente=new Cliente();
		cliente.DatosCliente();
	

		List<Producto> productos = new ArrayList<Producto>();
		
		Producto prod1 = new Producto("Procesador"," i7-4790K",38.389, "1");
		Producto prod2 = new Producto("Motherboard"," Asus Prime X570-P",19.139, "2");
		Producto prod3 = new Producto("Memoria RAM"," Kingston HyperX Fury",8.998, "3");
		Producto prod4 = new Producto("Fuente de energia"," CORSAIR CV650W 80PLUS BRONZE",17.972, "4");
		Producto prod5 = new Producto("Disco Rigido"," Western Digital Blue 1TB 7200Rpm SATA3",5.069, "5");
		
		productos.add(prod1);
		productos.add(prod2);
		productos.add(prod3);
		productos.add(prod4);
		productos.add(prod5);
		
		for (Producto producto : productos) {
			System.out.println(producto.getCodigo()+" --> "+producto.getTipo()+producto.getDescripcion()+" $"+producto.getPrecio());
		}
		
		Pedido pedido = new Pedido (001);
		System.out.println("\nIndiquenos el código del producto a comprar:");
		String codigoProductoAPedir = sc.nextLine();
	}

	
	

}
