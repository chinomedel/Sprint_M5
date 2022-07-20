package model.dao;

import java.util.List;

import model.entity.Administrativo;
import model.entity.Cliente;
import model.entity.Profesional;
import model.entity.Usuario;

public interface IUsuarioDAO {

	public void create(Usuario u);
	public List<Usuario> readAll();
	public Usuario readOne(String userName);
	public void update(Usuario u);
	public void delete(String userName);
	
	public void create(Cliente c);
	public List<Cliente> readAllCliente();
	public void update(Cliente userUpdate);
	public Cliente readOneCliente(String userName);
	public void delCliente(String userName);
	
	public void create(Administrativo a);
	public List<Administrativo> readAllAdministrativo();
	public void update(Administrativo userUpdate);
	public Administrativo readOneAdministrativo(String userName);
	public void delAdministrativo(String userName);
	
	public void create(Profesional p);
	public List<Administrativo> readAllProfesional();
	public void update(Profesional userUpdate);
	public Profesional readOneProfesional(String userName);
	public void delProfesional(String userName);
}
