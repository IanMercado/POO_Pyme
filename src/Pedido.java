import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pedido {
	
	private double total = 0;
	private int numeroPedido;
	private List<Producto> productos = new ArrayList<Producto>();
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public Pedido (int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	
	public int getNumeroPedido() {
		return this.numeroPedido;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	
//	public double getPrecioDistinto () {  INTENTO DE SUMA DE PRECIOS
//		for (Producto producto : productos) {
//		
//			int codigoProductoAPedir = sc.nextInt();
//			Producto productoAgregado =null;
//			
//			if (producto.getCodigo() == (codigoProductoAPedir)  ) {
//				
//				productoAgregado = producto;
//				
//				System.out.println(producto.getPrecio());
//				sc.nextLine();
//			}
//			
//		}
//			
//		return this.total;
//	}
}
