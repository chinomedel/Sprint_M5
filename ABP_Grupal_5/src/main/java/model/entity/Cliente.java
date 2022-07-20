package model.entity;

public class Cliente extends Usuario{
	
	private int rutCliente;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private String sistemaSalud;
    private String direccion;
    private String comuna;
    
	public Cliente() {
		super();
	}
	
	

	public Cliente(int id_usuario, String userName, String clave, int run, String fechaNacimiento, int edadUsuario,
			int tipoUsuario, int estado, int rutCliente, String nombres, String apellidos, String telefono, String afp, String sistemaSalud,
			String direccion, String comuna) {
		super(id_usuario, userName, clave, run, fechaNacimiento, edadUsuario, tipoUsuario, estado);
		this.rutCliente = rutCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		// TODO Auto-generated constructor stub
	}



	public Cliente(int rutCliente, String nombres, String apellidos, String telefono, String afp, String sistemaSalud,
			String direccion, String comuna) {
		super();
		this.rutCliente = rutCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
	}



	public Cliente(int int1, String string, String string2, int int2, String string3, int int3, int int4, int int5,
			String string4, String string5, long long1, String string6, String string7, String string8, String string9,
			String string10, String string11, String string12, String string13, int int6, String string14) {
		// TODO Auto-generated constructor stub
	}



	public int getRutCliente() {
		return rutCliente;
	}



	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getAfp() {
		return afp;
	}



	public void setAfp(String afp) {
		this.afp = afp;
	}



	public String getSistemaSalud() {
		return sistemaSalud;
	}



	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getComuna() {
		return comuna;
	}



	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	


}
