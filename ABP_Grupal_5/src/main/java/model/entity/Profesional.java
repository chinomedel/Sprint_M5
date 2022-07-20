package model.entity;

public class Profesional extends Usuario{
	private String titulo;
    private String fechaDeIngreso;
	
    public Profesional() {
		super();
	}

    
	public Profesional(int id_usuario, String userName, String clave, int run, String fechaNacimiento, int edadUsuario,
			int tipoUsuario, int estado, String titulo, String fechaDeIngreso) {
		super(id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado);
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
		// TODO Auto-generated constructor stub
	}


	public Profesional(String titulo, String fechaDeIngreso) {
		super();
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
   
    
    
}
