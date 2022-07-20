package model.entity;

import java.util.Date;

public class Usuario {
	private int id_usuario;
	private String userName;
	private String clave;
	private int run;
	private String fechaNacimiento;
	private int edadUsuario;
	private int tipoUsuario;
	private int estado;
	


	
	public Usuario(int id_usuario, String userName, String clave, int run, String fechaNacimiento, int edadUsuario,
			int tipoUsuario, int estado) {
		super();
		this.id_usuario = id_usuario;
		this.userName = userName;
		this.clave = clave;
		this.run = run;
		this.fechaNacimiento = fechaNacimiento;
		this.edadUsuario = edadUsuario;
		this.tipoUsuario = tipoUsuario;
		this.estado = estado;
	}
	
	public Usuario() {
		super();
	}


	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}




	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdadUsuario() {
		return edadUsuario;
	}

	public void setEdadUsuario(int edadUsuario) {
		this.edadUsuario = edadUsuario;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}


	
	
}
