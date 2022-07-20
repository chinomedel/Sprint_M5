package controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.conn.Conexion;
import model.entity.Usuario;
import model.service.IUsuarioService;
import model.service.UsuarioService;


@WebServlet("/")
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IUsuarioService us = new UsuarioService();
	
    public InicioServlet() {
        super();
        }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		/* Prueba de conexión
		 try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connection = DriverManager.getConnection("jdbc:mysql://localhost:3310/sakila", "root", "kupita");
			//connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3310/sakila", "root", "kupita");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/si_pr", "root", "admin");
			System.out.println("Conectado correctamente");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error al conectar a la Base de Datos");
			e.printStackTrace();
		}*/
		
		String op = new String();
		HttpSession sesion = request.getSession(true);
		
		op = "list";
		if(op == null) {
			op = "list";
		}
		
		switch(op) {
		case "list":{
			
			try {
				Connection cnn = Conexion.getConnection();
				
				if(cnn.isValid(1)) {
					System.out.println("Conexion válida");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			request.setAttribute("usuarios", us.readAll());
			System.out.println("antes");
			System.out.println(us.readAll());
			System.out.println("pase por aquí");
			request.setAttribute("op", op);
			getServletContext().getRequestDispatcher("/view/inicio.jsp").forward(request, response);
			break;
			}
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		HttpSession sesion = request.getSession(true);
		String op = new String();
		op = "list";
		if(op == null) {
			op = "list";
		}
		
		String userName = request.getParameter("userName");
		String clave = request.getParameter("clave");
		
		if(op.equals("list")) {
			//request.setAttribute("usuarios", us.getUsuario(name, pass));
			//Usuario user = us.read(userName);
			/*
			if(userName.equals(user.getUserName()) && clave.equals(user.getClave())) {
				getServletContext().getRequestDispatcher("/view/contacto.jsp").forward(request, response);
			}else {
				System.out.println("Usuario o clave incorrecta");
			}
			*/
			if(userName.equals("admin") && clave.equals("1234")) {
				getServletContext().getRequestDispatcher("/view/contacto.jsp").forward(request, response);
			}else {
				System.out.println("Usuario o clave incorrecta");
				getServletContext().getRequestDispatcher("/view/inicio.jsp").forward(request, response);
			}
		}
		
		doGet(request, response);
	}

}
