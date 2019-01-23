
public class empresa {
	private String CIF,nombre,direccion;
	private int emplados;

	public empresa() {
		super();
	}

	public empresa(String cIF, String nombre, String direccion, int emplados) {
		super();
		CIF = cIF;
		this.nombre = nombre;
		this.direccion = direccion;
		this.emplados = emplados;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEmplados() {
		return emplados;
	}

	public void setEmplados(int emplados) {
		this.emplados = emplados;
	}

	@Override
	public String toString() {
		return "empresa [CIF=" + CIF + ", nombre=" + nombre + ", direccion=" + direccion + ", emplados=" + emplados
				+ "]";
	}
	
	


}
