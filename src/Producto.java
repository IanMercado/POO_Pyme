import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producto {

	private String tipo;
	private String descripcion;
	private double precio;
	private String codigo;
	private int pedidoCliente;
	
	//constructor
	public Producto(String tipo, String descripcion, double precio, String codigo){
		this.tipo=tipo;
		this.descripcion=descripcion;
		this.precio=precio;
		this.codigo=codigo;
	}
	//Declarar
	Scanner sc = new Scanner(System.in);
	
	
	public String getCodigo(){
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

	
		
		

