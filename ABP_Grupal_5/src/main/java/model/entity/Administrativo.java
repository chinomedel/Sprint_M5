package model.entity;

public class Administrativo extends Usuario {
	private String area;
    private String experienciaPrevia;
    
	public Administrativo() {
		super();
	}
	
	public Administrativo(int id_usuario, String userName, String clave, int run, String fechaNacimiento,
			int edadUsuario, int tipoUsuario, int estado, String area, String experienciaPrevia) {
		super(id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
    
    
}
