package Test;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl3;

public class TestEntidadProducto {
	public static void main(String[] args) {
		//realizamos la respectiva instancia de las clases...
		TblProductocl3 producto=new TblProductocl3();
		ClassProductoImp crud=new ClassProductoImp();
		//asignamos valores
	/*	producto.setNombrecl3("fideos");
		producto.setPrecioventacl3(4);
		producto.setPreciocompcl3(2);
		producto.setEstadocl3("vigente");
	    producto.setDescripcl3("anita"); 
		
		//invocamos al metodo registrar...
		crud.RegistrarProducto(producto); */

		//TESTEANDO LISTADO
		  List<TblProductocl3> listado=crud.ListadoProducto();
		//aplicamos un bucle for...
		for(TblProductocl3 lis:listado) {
			//imprimimos por pantalla
			System.out.println("nombre: "+lis.getNombrecl3()+" precio venta: "+lis.getPrecioventacl3()+
					" precio compra: "+lis.getPreciocompcl3()+
					" estado: "+lis.getEstadocl3()+
					" descripcion: "+lis.getDescripcl3()); 
					
		}
	} 
}//fin del metodo main...

 //fin de la clase...

