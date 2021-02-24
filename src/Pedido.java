import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

	private int numeroPedido;
	private List<Producto> productos = new ArrayList<Producto>();

	Scanner sc = new Scanner(System.in);

	public Pedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

}
