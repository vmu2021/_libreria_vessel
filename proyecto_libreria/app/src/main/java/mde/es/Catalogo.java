package mde.es;

public class Catalogo {

  private long id;
	private String nombre;
	
  public String getNombre() {
    return nombre;
  }
	
	public long getId() {
    return id;
  }
	
	public void setNombre(String nombre) {
    this.nombre = nombre;
  }
	
	public void setId(long id) {
    this.id = id;
  }

	public Catalogo() {};
	
	public Catalogo(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Catalogo " + getNombre() + " dispone de productos de alimentacion y menaje";
	}

}