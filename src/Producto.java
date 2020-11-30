import java.util.ArrayList;
import java.util.Scanner;

public class Producto {

	String tipo;
	String descripcion;
	double precio;
	int codigo;
	int pedidoCliente;
	
	//constructor
	Producto(String tipo, String descripcion, double precio, int codigo){
		this.tipo=tipo;
		this.descripcion=descripcion;
		this.precio=precio;
		this.codigo=codigo;
	}
	//Declarar
	Scanner sc = new Scanner(System.in);
		public void Listaproductos () {
			
			ArrayList<Producto> listaproductos;
			
			//Instanciar
			listaproductos=new ArrayList<Producto>();
				
			//Agregar elementos
			listaproductos.add( new Producto("Procesador"," i7-4790K",38.389, 1) );
			listaproductos.add( new Producto("Motherboard"," Asus Prime X570-P",19.139, 2) );
			listaproductos.add( new Producto("Memoria RAM"," Kingston HyperX Fury",8.998, 3) );
			listaproductos.add( new Producto("Fuente de energia"," CORSAIR CV650W 80PLUS BRONZE",17972.03, 4) );
			listaproductos.add( new Producto("Disco Rigido"," Western Digital Blue 1TB 7200Rpm SATA3",5069.00, 5) );
			
			
			//Recorrer ArrayList
			for (int i = 0; i < listaproductos.size(); i++) {
			
				
				System.out.println("--> codigo "+listaproductos.get(i).codigo 
						+ " = " + listaproductos.get(i).descripcion 
						+ " /Precio: " + listaproductos.get(i).precio);}
			
			
			
				System.out.println("Indique el codigo para proceder la compra: ");
				int pedidoCliente = sc.nextInt(listaproductos.get(codigo));
				
				System.out.println("Usted selecciono  " + pedidoCliente);
					
		
		} 
			
			
			
			
			
//			public void pedidoCliente (){
//			System.out.println("Indique el codigo para proceder la compra: ");
//			int pedidoCliente = sc.nextInt();
//			
//			}
			
	                    		
//			NO DAR BOLA 
			
//			public void seleccion() {
//			ArrayList<Producto> seleccion;
//			seleccion=new ArrayList<Producto>();
//			seleccion.add(listaproductos.get(
//			}
			
			
}

	
		
		

