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
		
		Producto prod1 = new Producto("Procesador"," i7-4790K",38389, 1);
		Producto prod2 = new Producto("Motherboard"," Asus Prime X570-P",19139, 2);
		Producto prod3 = new Producto("Memoria RAM"," Kingston HyperX Fury",8998, 3);
		Producto prod4 = new Producto("Fuente de energia"," CORSAIR CV650W 80PLUS BRONZE",17972, 4);
		Producto prod5 = new Producto("Disco Rigido"," Western Digital Blue 1TB 7200Rpm SATA3",5069, 5);
		
		productos.add(prod1);
		productos.add(prod2);
		productos.add(prod3);
		productos.add(prod4);
		productos.add(prod5);
		
		for (Producto producto : productos) {
			System.out.println(producto.getCodigo()+" --> "+producto.getTipo()+producto.getDescripcion()+" $"+producto.getPrecio());
		}
		
		Pedido pedido = new Pedido (5000);
		
		Producto productoAgregado =null;
		

		String respuesta;
		int i = 0;
		double Total = 0;
		
		do {
		
			System.out.println("\nIndiquenos el código del producto a comprar:");
			
			int codigoProductoAPedir = sc.nextInt();
			
		for (Producto producto : productos) {
			if (producto.getCodigo() == (codigoProductoAPedir)  ) {
				
					productoAgregado = producto;
//					pedido.getPrecioDistinto(); INTENTO DE SUMA DE PRECIOS
					Total = Total + producto.getPrecio();
					System.out.println(producto.getTipo() + producto.getDescripcion());
					sc.nextLine();
				}
		pedido.agregarProducto(productoAgregado);
		
		}
		System.out.println ("\n¿Queres seguir comprando? SI/NO");
		respuesta = sc.nextLine();
		
		i++;
		
		
		}while (respuesta.equalsIgnoreCase("si")); 
		if (respuesta.equalsIgnoreCase("No")) {
			System.out.println("\n**Su número de pedido es el: "+ pedido.getNumeroPedido() +"\n**Usted pidió: " + i +  " productos" + "\n**GRACIAS POR SU COMPRA!");
			} 
		
	
		}
}
