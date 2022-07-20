package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.entity.Usuario;
import model.service.IUsuarioService;
import model.service.UsuarioService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();

    }
    
    private IUsuarioService us = new UsuarioService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String userName = request.getParameter("userName");
		String clave = request.getParameter("clave");
		
		System.out.println("Username: "+userName);
		System.out.println("Clave: "+clave);
		
	
		//Usuario user = us.readOne(userName);
		
		List<Usuario> user = us.readAll();
		for (Usuario usuario : user) {
			System.out.println(us.readOne(userName));
			System.out.println(usuario.getUserName());
			if(userName.equals(usuario.getUserName()) && clave.equals(usuario.getClave())) {
				System.out.println("son iguales: "+ userName+" "+us.readOne(userName));
				getServletContext().getRequestDispatcher("/view/contacto.jsp").forward(request, response);
			}
		}
		request.setAttribute("usuario", us.readOne(userName));
		
		System.out.println(us.readOne(userName));
		System.out.println("Prueba: "+user);
		//Imprime por consola los datos del constructor vacío us.getUsuario()
		/*
		if(user != null) {
			System.out.println("prueba user: "+user);
			System.out.println("usuario: "+ user.getUserName());
			//System.out.println("daots: "+ us.getUsuarios());


			request.setAttribute("usuario", us.readAll());
			
			if(userName.equals(user.getUserName()) && clave.equals(user.getClave())) {
				getServletContext().getRequestDispatcher("/view/contacto.jsp").forward(request, response);
			}else {
				getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
			}
		}
		*/
		getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);

		
		doGet(request, response);
	}

}
