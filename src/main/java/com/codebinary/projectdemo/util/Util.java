package com.codebinary.projectdemo.util;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Util extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	private String rutaJsp;
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		
		//Configuracion para agregar / antes a las vistas
		rutaJsp = config.getInitParameter("rutaJsp");
		
		
	}
	
	//Método para redireccionar las vistas
	public RequestDispatcher redireccionar(String vista){
		
		String ruta = rutaJsp + vista + ".jsp";
		return getServletContext().getRequestDispatcher(ruta);
		
	}
}
