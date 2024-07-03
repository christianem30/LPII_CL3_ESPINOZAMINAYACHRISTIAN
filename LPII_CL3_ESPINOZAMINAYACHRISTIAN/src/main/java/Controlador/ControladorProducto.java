package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl3;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TblProductocl3  producto = new TblProductocl3();
		ClassProductoImp crud = new ClassProductoImp();
		List<TblProductocl3> listadoproducto=crud.ListadoProducto();
		//invocamos el listado de productos
		request.setAttribute("listadodeproductos", listadoproducto);
		//redireccionemos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los valores del formulario...
		String nombre=request.getParameter("nombre");
		double precioventa=Double.parseDouble(request.getParameter("precioventa"));
		double preciocompra=Double.parseDouble(request.getParameter("preciocompra"));
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");
	
		//instanciar las respectivas entidades...
		TblProductocl3 producto=new TblProductocl3();
		ClassProductoImp crud=new ClassProductoImp();
		//asignamos valores
		producto.setNombrecl3(nombre);
		producto.setPrecioventacl3(precioventa);
		producto.setPreciocompcl3(preciocompra);
		producto.setEstadocl3(estado);
		producto.setDescripcl3(descripcion);
	
		//invocamos la metodo registrar...
		crud.RegistrarProducto(producto);
		//actualizamos listado
		List<TblProductocl3> listadoproducto=crud.ListadoProducto();
		//invocamos el listado de productos
		request.setAttribute("listadodeproductos", listadoproducto);
		
		//redireccionamos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	
		

	}  //fin del metodo dopost...

	}


