package model.service;

import java.util.List;
import java.util.ArrayList;

import model.dao.IUsuarioDAO;
import model.dao.UsuarioDAO;
import model.entity.Administrativo;
import model.entity.Cliente;
import model.entity.Profesional;
import model.entity.Usuario;

public class UsuarioService implements IUsuarioService{

	IUsuarioDAO udao = new UsuarioDAO();
	
	@Override
	public void create(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return udao.readAll();
	}

	@Override
	public Usuario readOne(String userName) {
		// TODO Auto-generated method stub
		return udao.readOne(userName);
	}

	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String userName) {
		// TODO Auto-generated method stub
		udao.delete(userName);
		
	}

	@Override
	public void create(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> readAllCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cliente userUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente readOneCliente(String userName) {
		// TODO Auto-generated method stub
		return udao.readOneCliente(userName);
	}

	@Override
	public void delCliente(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Administrativo a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Administrativo> readAllAdministrativo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Administrativo userUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Administrativo readOneAdministrativo(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delAdministrativo(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Profesional p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Profesional> readAllProfesional() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Profesional userUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profesional readOneProfesional(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delProfesional(String userName) {
		// TODO Auto-generated method stub
		
	}


			
}

