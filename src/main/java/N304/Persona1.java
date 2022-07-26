package N304;



public class Persona1 {
    
	//Attributes
	private String nombre;
	private String apellidos;
	private String dNI;

	//constructor
	public Persona1(String nombre, String apellidos, String dNI) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dNI = dNI;
	}

	//setters/getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getdNI() {
		return dNI;
	}


	public void setdNI(String dNI) {
		this.dNI = dNI;
	}
	
	//Metodos generales
	public  String toString() {
		return this.nombre + this.apellidos + this.dNI;
	}
}
