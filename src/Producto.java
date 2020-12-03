

public class Producto {

	private String tipo;
	private String descripcion;
	private double precio;
	private int codigo;
	private int pedidoCliente;
	
	//constructor
	public Producto(String tipo, String descripcion, double precio, int codigo){
		this.tipo=tipo;
		this.descripcion=descripcion;
		this.precio=precio;
		this.codigo=codigo;
	}
	
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public double getPrecio(){
		return this.precio;
	}
	
}

	
		
		

