package mde.es;

public abstract class Producto {

	private String nombre;
	private String codigo;
	private float precio;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Producto() {
	};

	public Producto(String nombre, String nif) {
		this.nombre = nombre;
		this.codigo = nif;
	}

}