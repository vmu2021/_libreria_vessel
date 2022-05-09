package mde.es;

public class Alimentacion extends Producto {

	private boolean refrigerado;
	
	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	public Alimentacion() {};

	public Alimentacion(String nombre, String codigo, boolean refrigerado) {
		super(nombre, codigo);
		this.refrigerado = refrigerado;
	}
	
	@Override
	public String toString() {
		return "Alimento: " + isRefrigerado() + ", me llamo " + getNombre();
	}

}