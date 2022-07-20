package model.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.conn.Conexion;
import model.entity.Administrativo;
import model.entity.Cliente;
import model.entity.Profesional;
import model.entity.Usuario;

public class UsuarioDAO implements IUsuarioDAO{

	@Override
	public void create(Usuario u) {
		Connection conect = Conexion.getConnection();
		
	}

	@Override
	public List<Usuario> readAll() {
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		try {
			
			String sql = "select id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado from usuario";
			
			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()){
				
				listaUsuarios.add(new Usuario(rs.getInt("id_usuario"), rs.getString("userName"), rs.getString("clave"),
						rs.getInt("run"), rs.getString("fechaNacimiento"),rs.getInt("edadUsuario"),rs.getInt("tipoUsuario"),rs.getInt("estado")));
			}
			
			
		}catch (SQLException e ) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		return listaUsuarios;
	}

	@Override
	public Usuario readOne(String userName) {
		Usuario u = new Usuario();
		
		System.out.println("Pase por read One");
		try {
			String sql = "select id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado from usuario where userName ='"+userName+"'";
			
			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				u = new Usuario(rs.getInt("id_usuario"), rs.getString("userName"), rs.getString("clave"),
						rs.getInt("run"), rs.getString("fechaNacimiento"),rs.getInt("edadUsuario"),rs.getInt("tipoUsuario"),rs.getInt("estado"));
			}
			System.out.println("Pase por read One");
		} catch(SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		
		return u;
	}

	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String userName) {
		// TODO Auto-generated method stub
		System.out.println("pase por delet bd");
		String sql ="delete from usuario where userName = '" + userName+"'";
		try {
			Connection conect = Conexion.getConnection();
			
			Statement stm = conect.createStatement();

			stm.execute(sql);
		}catch(SQLException e) {
			System.out.println("Error al consiultar la BD para crear");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void create(Cliente c) {
		System.out.println("consulta crear");
		try {

			String sql = "insert into usuario(userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, rutCliente, nombres,"
					+ "apellidos, telefono, afp, sistemaSalud, direccion, comuna, estado)"+ " values ('"
					+ c.getUserName()+"','"+c.getClave()+"',"+c.getRun()+",'"+c.getFechaNacimiento()+"',"+c.getEdadUsuario()+","+c.getTipoUsuario()+","+c.getRutCliente()
					+",'"+c.getNombres()+"','"+c.getApellidos()+"','"+c.getTelefono()+"','"+c.getAfp()+"','"+c.getSistemaSalud()+"','"+c.getDireccion()+"','"+c.getComuna()
					+"',"+ 1 +")";
		

			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();


			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD para crear");
			e.printStackTrace();
		}
	}

	@Override
	public List<Cliente> readAllCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cliente userUpdate) {
		System.out.println("consulta Update");
		try {

			String sql = "update usuario set userName = '"+userUpdate.getUserName()+"', clave ='"+ userUpdate.getClave()
					+ "',run ="+ userUpdate.getRun()+", fechaNacimiento = '" + userUpdate.getFechaNacimiento()
					+"', edadUsuario ="+userUpdate.getEdadUsuario()
					+ ", tipoUsuario = '"+userUpdate.getTipoUsuario()
					+ "',rutCliente ="+ userUpdate.getRutCliente()+", nombres = '"+userUpdate.getNombres()
					+ "', apellidos = '"+userUpdate.getApellidos()+"', telefono ='"+userUpdate.getTelefono()
					+ "',afp ='"+userUpdate.getAfp()+"', sistemaSalud = '"+ userUpdate.getSistemaSalud()
					+ "', direccion = '"+ userUpdate.getDireccion()+"',comuna ='"+userUpdate.getComuna()
					+ "' where userName = '"+ userUpdate.getUserName()+"'";
		

			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();


			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD");
			e.printStackTrace();
		}
	}

	@Override
	public Cliente readOneCliente(String userName) {
		Cliente c = new Cliente();
		System.out.println("consulta base redOneCliente");
		try {
			String sql = "select id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado,rutCliente, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna from usuario where userName ='"+ userName+"'";
			
			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				c = new Cliente(rs.getInt("id_usuario"), rs.getString("userName"), rs.getString("clave"),
						rs.getInt("run"), rs.getString("fechaNacimiento"),rs.getInt("edadUsuario"),
						rs.getInt("tipoUsuario"),rs.getInt("estado"), rs.getInt("rutCliente"), rs.getString("nombres"),
						rs.getString("apellidos"), rs.getString("telefono"), rs.getString("afp"), rs.getString("sistemaSalud"),
						rs.getString("direccion"), rs.getString("comuna"));
			}
		} catch(SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		return c;
	}

	@Override
	public void delCliente(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Administrativo a) {
		System.out.println("consulta crear");
		try {

			String sql = "insert into usuario(userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, area, experienciaPrevia, estado)"+ " values ('"
					+ a.getUserName()+"','"+a.getClave()+"',"+a.getRun()+",'"+a.getFechaNacimiento()+"',"+a.getEdadUsuario()+","+a.getTipoUsuario()+",'"+a.getArea()
					+"','"+a.getExperienciaPrevia()+"',"+ 1 +")";
		

			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD para crear");
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Administrativo> readAllAdministrativo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Administrativo userUpdate) {
		System.out.println("consulta Update Administrativo");
		try {

			String sql = "update usuario set userName = '"+userUpdate.getUserName()+"', clave ='"+ userUpdate.getClave()
					+ "',run ="+ userUpdate.getRun()+", fechaNacimiento = '" + userUpdate.getFechaNacimiento()
					+"', edadUsuario ="+userUpdate.getEdadUsuario()
					+ ", tipoUsuario = '"+userUpdate.getTipoUsuario()
					+ "',area ='"+ userUpdate.getArea()+"', experienciaPrevia = '"+userUpdate.getExperienciaPrevia()
					+ "' where userName = '"+ userUpdate.getUserName()+"'";
		

			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();


			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD");
			e.printStackTrace();
		}
		
	}

	@Override
	public Administrativo readOneAdministrativo(String userName) {
		Administrativo a = new Administrativo();
		System.out.println("consulta base redOneCliente");
		try {
			String sql = "select id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado, area, experienciaPrevia from usuario where userName ='"+ userName+"'";
			
			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				a = new Administrativo(rs.getInt("id_usuario"), rs.getString("userName"), rs.getString("clave"),
						rs.getInt("run"), rs.getString("fechaNacimiento"),rs.getInt("edadUsuario"),
						rs.getInt("tipoUsuario"),rs.getInt("estado"), 
						rs.getString("area"), rs.getString("experienciaPrevia"));
			}
		} catch(SQLException e) {
			System.out.println("Error al consultar la BD");
			e.printStackTrace();
		}
		
		return a;
	}

	@Override
	public void delAdministrativo(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Profesional p) {
		System.out.println("consulta crear profesinal");
		try {

			String sql = "insert into usuario(userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, titulo, fechaDeIngreso, estado)"+ " values ('"
					+ p.getUserName()+"','"+p.getClave()+"',"+p.getRun()+",'"+p.getFechaNacimiento()+"',"+p.getEdadUsuario()+","+p.getTipoUsuario()+",'"+p.getTitulo()
					+"','"+p.getFechaDeIngreso()+"',"+ 1 +")";
		

			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD para crear profesional");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Administrativo> readAllProfesional() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Profesional userUpdate) {
		System.out.println("consulta Update Profesional");
		try {

			String sql = "update usuario set userName = '"+userUpdate.getUserName()+"', clave ='"+ userUpdate.getClave()
					+ "',run ="+ userUpdate.getRun()+", fechaNacimiento = '" + userUpdate.getFechaNacimiento()
					+"', edadUsuario ="+userUpdate.getEdadUsuario()
					+ ", tipoUsuario = '"+userUpdate.getTipoUsuario()
					+ "',titulo ='"+ userUpdate.getTitulo()+"', fechaDeIngreso = '"+userUpdate.getFechaDeIngreso()
					+ "' where userName = '"+ userUpdate.getUserName()+"'";
		

			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("Error al consiultar la BD update profesional");
			e.printStackTrace();
		}
		
	}

	@Override
	public Profesional readOneProfesional(String userName) {
		Profesional p = new Profesional();
		System.out.println("consulta base redOneProfesional");
		try {
			String sql = "select id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado, titulo, fechaDeIngreso from usuario where userName ='"+ userName+"'";
			
			Connection conect = Conexion.getConnection();
			Statement stm = conect.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				p = new Profesional(rs.getInt("id_usuario"), rs.getString("userName"), rs.getString("clave"),
						rs.getInt("run"), rs.getString("fechaNacimiento"),rs.getInt("edadUsuario"),
						rs.getInt("tipoUsuario"),rs.getInt("estado"), 
						rs.getString("titulo"), rs.getString("fechaDeIngreso"));
			}
		} catch(SQLException e) {
			System.out.println("Error al consultar la BD readOneProfesional");
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public void delProfesional(String userName) {
		// TODO Auto-generated method stub
		
	}

}
