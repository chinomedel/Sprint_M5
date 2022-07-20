package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.entity.Administrativo;
import model.entity.Cliente;
import model.entity.Profesional;
import model.entity.Usuario;
import model.service.AdministrativoService;
import model.service.ClienteService;
import model.service.IUsuarioService;
import model.service.ProfesionalService;
import model.service.UsuarioService;

@WebServlet("/ListarUsuarios")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UsuariosServlet() {
        super();
    }
    
    private IUsuarioService us = new UsuarioService();
    private IUsuarioService cs = new ClienteService();
    private IUsuarioService as = new AdministrativoService();
    private IUsuarioService ps = new ProfesionalService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String opcion = request.getParameter("opcion");
		String userName = request.getParameter("userName");
		String tipoUsuario = request.getParameter("tipoUsuario");
		
		HttpSession sesion = request.getSession(true);
		
		if(opcion == null) {
			opcion = "lista";
		}
		
		switch (opcion) {
		case "lista": {
			
			request.setAttribute("usuarios", us.readAll());
			
			getServletContext().getRequestDispatcher("/view/listaUsuarios.jsp").forward(request, response); 
			
			break;
		}
		case "crear": {
			request.setAttribute("opcion", opcion);
			getServletContext().getRequestDispatcher("/view/usuarioForm.jsp").forward(request, response);
			break;
		}
		case "editar":{
			userName = request.getParameter("id");
			
			request.setAttribute("usuario", us.readOne(userName));
			request.setAttribute("Cliente",cs.readOneCliente(userName));
			request.setAttribute("Administrativo", as.readOneAdministrativo(userName));
			request.setAttribute("Profesional", ps.readOneProfesional(userName));
			request.setAttribute("opcion", opcion);
			getServletContext().getRequestDispatcher("/view/usuarioForm.jsp").forward(request, response);
			
			System.out.println("Usuario: "+userName);
			
			
			
			break;
		}
		case "del": {
			userName = request.getParameter("id");
			//Cliente userCliente = cs.readOneCliente(userName);
			
			System.out.println("Paso por del de usuario servlet");
			
			us.delete(userName);
			
			request.setAttribute("usuarios", us.readAll());
			//request.setAttribute("Cliente", cs.readOneCliente(userName));
			request.setAttribute("opcion", "lista");
			getServletContext().getRequestDispatcher("/view/listaUsuarios.jsp").forward(request, response);
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		
		
		
		
	}


	private List<Usuario> UsuarioService() {
		// TODO Auto-generated method stub
		return null;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String opcion = request.getParameter("opcion");
		String userName = request.getParameter("userName");
		HttpSession sesion = request.getSession(true);
		
		Cliente cliente;
		Administrativo administrativo;
		Profesional profesional;
		System.out.println("Paso por post");
		
		if(opcion == null) {
			opcion = "lista";
			System.out.println("Paso por post lista");
		}
		
		switch (opcion) {
		case "editar": {
			System.out.println("Paso por post editar");
			request.getParameter("tipoUsuario");
			System.out.println("Tipo usuario: "+request.getParameter("tipoUsuario"));
			if(request.getParameter("tipoUsuario").equals("Cliente")) {
				
					cliente = cs.readOneCliente(userName);
					System.out.println("Paso por editar Cliente");
					
					cliente.setUserName(request.getParameter("userName"));
					cliente.setClave(request.getParameter("clave"));
					cliente.setRun(Integer.parseInt(request.getParameter("run")));
					cliente.setFechaNacimiento(request.getParameter("fechaNacimiento"));
					cliente.setEdadUsuario(Integer.parseInt(request.getParameter("edadUsuario")));
					//cliente.setTipoUsuario(Integer.parseInt(request.getParameter("tipoUsuario")));
					if(request.getParameter("tipoUsuario").equals("Cliente")) {
						cliente.setTipoUsuario(1);
					}else if(request.getParameter("tipoUsuario").equals("Administrativo")) {
						cliente.setTipoUsuario(2);
					}else if(request.getParameter("tipoUsuario").equals("Profesional")) {
						cliente.setTipoUsuario(3);
					}
					
					if(request.getParameter("rutCliente") == null) {
						cliente.setRutCliente(0);
					}else {
						cliente.setRutCliente(Integer.parseInt(request.getParameter("rutCliente")));
					}
					
					cliente.setNombres(request.getParameter("nombres"));
					cliente.setApellidos(request.getParameter("apellidos"));
					cliente.setTelefono(request.getParameter("telefono"));
					cliente.setAfp(request.getParameter("afp"));
					cliente.setSistemaSalud(request.getParameter("sistemaSalud"));
					cliente.setDireccion(request.getParameter("direccion"));
					cliente.setComuna(request.getParameter("comuna"));
					System.out.println(request.getParameter("tipoUsuario"));
					System.out.println("El cliente: "+cliente.getTipoUsuario());
					
					cs.update(cliente);
					
				}else if (request.getParameter("tipoUsuario").equals("Administrativo")) {
					administrativo = as.readOneAdministrativo(userName);
					System.out.println("Paso por editar Administrativo");
					
					administrativo.setUserName(request.getParameter("userName"));
					administrativo.setClave(request.getParameter("clave"));
					administrativo.setRun(Integer.parseInt(request.getParameter("run")));
					administrativo.setFechaNacimiento(request.getParameter("fechaNacimiento"));
					administrativo.setEdadUsuario(Integer.parseInt(request.getParameter("edadUsuario")));
					//cliente.setTipoUsuario(Integer.parseInt(request.getParameter("tipoUsuario")));
					if(request.getParameter("tipoUsuario").equals("Cliente")) {
						administrativo.setTipoUsuario(1);
					}else if(request.getParameter("tipoUsuario").equals("Administrativo")) {
						administrativo.setTipoUsuario(2);
					}else if(request.getParameter("tipoUsuario").equals("Profesional")) {
						administrativo.setTipoUsuario(3);
					}
					administrativo.setArea(request.getParameter("area"));
					administrativo.setExperienciaPrevia(request.getParameter("experienciaPrevia"));
					
					as.update(administrativo);
				}else if (request.getParameter("tipoUsuario").equals("Profesional")) {
					profesional = ps.readOneProfesional(userName);
					System.out.println("Paso por editar Profesional");
					
					profesional.setUserName(request.getParameter("userName"));
					profesional.setClave(request.getParameter("clave"));
					profesional.setRun(Integer.parseInt(request.getParameter("run")));
					profesional.setFechaNacimiento(request.getParameter("fechaNacimiento"));
					profesional.setEdadUsuario(Integer.parseInt(request.getParameter("edadUsuario")));
					//cliente.setTipoUsuario(Integer.parseInt(request.getParameter("tipoUsuario")));
					if(request.getParameter("tipoUsuario").equals("Cliente")) {
						profesional.setTipoUsuario(1);
					}else if(request.getParameter("tipoUsuario").equals("Administrativo")) {
						profesional.setTipoUsuario(2);
					}else if(request.getParameter("tipoUsuario").equals("Profesional")) {
						profesional.setTipoUsuario(3);
					}
					profesional.setTitulo(request.getParameter("titulo"));
					profesional.setFechaDeIngreso(request.getParameter("fechaDeIngreso"));
					
					ps.update(profesional);
				}
			
			break;
		}
		case "crear":{
			
			request.getParameter("tipoUsuario");
			if(request.getParameter("tipoUsuario").equals("Cliente")) {
				
				System.out.println("Paso por crear");
				Cliente newCliente = new Cliente();
				newCliente.setUserName(request.getParameter("userName"));
				newCliente.setClave(request.getParameter("clave"));
				newCliente.setRun(Integer.parseInt(request.getParameter("run")));
				newCliente.setFechaNacimiento(request.getParameter("fechaNacimiento"));
				newCliente.setEdadUsuario(Integer.parseInt(request.getParameter("edadUsuario")));
				//cliente.setTipoUsuario(Integer.parseInt(request.getParameter("tipoUsuario")));
				if(request.getParameter("tipoUsuario").equals("Cliente")) {
					newCliente.setTipoUsuario(1);
				}else if(request.getParameter("tipoUsuario").equals("Administrativo")) {
					newCliente.setTipoUsuario(2);
				}else if(request.getParameter("tipoUsuario").equals("Profesional")) {
					newCliente.setTipoUsuario(3);
				}
				
				if(request.getParameter("rutCliente") == null) {
					newCliente.setRutCliente(0);
				}else {
					newCliente.setRutCliente(Integer.parseInt(request.getParameter("rutCliente")));
				}
				
				newCliente.setNombres(request.getParameter("nombres"));
				newCliente.setApellidos(request.getParameter("apellidos"));
				newCliente.setTelefono(request.getParameter("telefono"));
				newCliente.setAfp(request.getParameter("afp"));
				newCliente.setSistemaSalud(request.getParameter("sistemaSalud"));
				newCliente.setDireccion(request.getParameter("direccion"));
				newCliente.setComuna(request.getParameter("comuna"));
				System.out.println(request.getParameter("tipoUsuario"));
				System.out.println("El cliente: "+newCliente.getTipoUsuario());
				
				cs.create(newCliente);
				
			}else if(request.getParameter("tipoUsuario").equals("Administrativo")) {
				System.out.println("Tipo usuario Administrativo");
				
				Administrativo newAdmin = new Administrativo();
				newAdmin.setUserName(request.getParameter("userName"));
				newAdmin.setClave(request.getParameter("clave"));
				newAdmin.setRun(Integer.parseInt(request.getParameter("run")));
				newAdmin.setFechaNacimiento(request.getParameter("fechaNacimiento"));
				newAdmin.setEdadUsuario(Integer.parseInt(request.getParameter("edadUsuario")));
				//cliente.setTipoUsuario(Integer.parseInt(request.getParameter("tipoUsuario")));
				if(request.getParameter("tipoUsuario").equals("Cliente")) {
					newAdmin.setTipoUsuario(1);
				}else if(request.getParameter("tipoUsuario").equals("Administrativo")) {
					newAdmin.setTipoUsuario(2);
				}else if(request.getParameter("tipoUsuario").equals("Profesional")) {
					newAdmin.setTipoUsuario(3);
				}
				newAdmin.setArea(request.getParameter("area"));
				newAdmin.setExperienciaPrevia(request.getParameter("experienciaPrevia"));
				
				as.create(newAdmin);
				
			}else if(request.getParameter("tipoUsuario").equals("Profesional")) {
				System.out.println("Tipo usuario Profesional");
				
				Profesional newPro = new Profesional();
				newPro.setUserName(request.getParameter("userName"));
				newPro.setClave(request.getParameter("clave"));
				newPro.setRun(Integer.parseInt(request.getParameter("run")));
				newPro.setFechaNacimiento(request.getParameter("fechaNacimiento"));
				newPro.setEdadUsuario(Integer.parseInt(request.getParameter("edadUsuario")));
				//cliente.setTipoUsuario(Integer.parseInt(request.getParameter("tipoUsuario")));
				if(request.getParameter("tipoUsuario").equals("Cliente")) {
					newPro.setTipoUsuario(1);
				}else if(request.getParameter("tipoUsuario").equals("Administrativo")) {
					newPro.setTipoUsuario(2);
				}else if(request.getParameter("tipoUsuario").equals("Profesional")) {
					newPro.setTipoUsuario(3);
				}
				newPro.setTitulo(request.getParameter("titulo"));
				newPro.setFechaDeIngreso(request.getParameter("fechaDeIngreso"));
				
				ps.create(newPro);
				
			}
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		
		request.setAttribute("opcion", "lista");
		request.setAttribute("usuarios", us.readAll());
		getServletContext().getRequestDispatcher("/view/listaUsuarios.jsp").forward(request, response); 
		//doGet(request, response);
	}

}
