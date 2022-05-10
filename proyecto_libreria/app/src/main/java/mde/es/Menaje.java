package mde.es;

public class Menaje extends Producto {

	private boolean reciclable;

	public boolean isReciclable() {
		return reciclable;
	}

	public void setReciclable(boolean reciclable) {
		this.reciclable = reciclable;
	}

	public Menaje() {
	};

	public Menaje(String nombre, String codigo, boolean reciclable) {
		super(nombre, codigo);
		this.reciclable = reciclable;
	}
	
	@Override
	public String toString() {
		return "[" + getCodigo() + "]" + "Menaje: " + getNombre() +" refrigerado [" + isReciclable() + "]";
	}

}