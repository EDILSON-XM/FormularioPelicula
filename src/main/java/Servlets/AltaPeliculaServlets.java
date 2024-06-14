package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AltaPeliculaServlets
 */
@WebServlet("/AltaPelicula")
public class AltaPeliculaServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AltaPeliculaServlets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida= response.getWriter();
		salida.println(UtilidadesServlets.getCabecera("Pelicula nueva"));
		
		salida.println("<p>Debe rellenar el formulario</p>");
		salida.println("<a href='formulario.html'>ir a alta de Pelicula</a>");
		salida.println(UtilidadesServlets.getPie());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida= response.getWriter();
		String Titulo= request.getParameter("Título");
		String Género= request.getParameter("Género");
		String Duración= request.getParameter("Duración");
		String Calificación= request.getParameter("Calificación");
		String Premios[]= request.getParameterValues("Premios");
		salida.println(UtilidadesServlets.getCabecera("resusltado del formulario"));
		
			salida.println("<h1>Resultado del formulario");
			salida.println("<p>Titulo:"+ Titulo + "<p>");
			salida.println("<p>Género:"+ Género + "<p>");
			salida.println("<p> Duración:"+ Duración + "<p>");
			 salida.println("<p>Calificación:"+  Calificación + "<p>");
			
			
			salida.println("<p> Premios:");
			if(Premios==null) {
				salida.println("No se ha selecionado ningun premio");
				
			}else {
				
				for( int i=0; i<Premios.length; i++  ){
					
				String premio = Premios [i];
				salida.println( "<p>"+premio +"</p> ");
				
			}
				
			}
			 salida.println("</p>");
			
			
			
			
			salida.println(UtilidadesServlets.getPie());
	}

}
