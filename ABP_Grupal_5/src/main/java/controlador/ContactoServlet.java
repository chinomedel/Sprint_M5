package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactoServlet
 */
@WebServlet("/ContactoServlet")
public class ContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ContactoServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/view/contacto.jsp").forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String clave = request.getParameter("clave");
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String mensaje = request.getParameter("mensaje");
		
		System.out.println("nombre: "+nombre);
		System.out.println("Email: "+email);
		System.out.println("Mensaje: "+mensaje);
		getServletContext().getRequestDispatcher("/view/contacto.jsp").forward(request, response); 
		//doGet(request, response);
	}

}
