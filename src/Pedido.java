import java.util.ArrayList;
import java.util.List;


public class Pedido {
	
	private double total = 0;
	private int numeroPedido;
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	public Pedido (int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	
	public int getNumeroPedido() {
		return this.numeroPedido;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double getPrecioDistinto () {
		for (Producto producto : productos) {
			this.total=producto.getPrecio();
			total = total + producto.getPrecio();
		}
		return this.total;
	}
}
