package mde.es;

public abstract class Producto {

	  private long id;
		private String nombre;
		private String codigo;
			
		public long getId() {
	    return id;
	  }
		
	  public String getNif() {
	    return codigo;
	  }
	  
	  public String getNombre() {
	    return nombre;
	  }
	  
	  public void setNombre(String nombre) {
	    this.nombre = nombre;    
	  }
	  
	  public void setNif(String nif) {
	    this.codigo = nif;
	  }
		
	  public void setId(long id) {
	    this.id = id;
	  }
	  
	  public Producto() {};
	  
	  public Producto(String nombre, String nif){
			this.nombre = nombre;
			this.codigo = nif;
		}
		
	}