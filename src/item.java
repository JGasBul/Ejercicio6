
public class item {
	private int id;
	private String nombre;
	int cantidad;

	public item() {
		super();
	}

	public item( String nombre, int i) {
		super();
		this.nombre = nombre;
		this.cantidad = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



}
