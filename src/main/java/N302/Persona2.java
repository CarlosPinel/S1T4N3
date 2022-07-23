package N302;

import java.util.Objects;



public class Persona2 {
    
	//Attributes
	String nombre;
	String apellidos;
	String dNI;

	//constructor
	public Persona2(String nombre, String apellidos, String dNI) {
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
	
	//hashCode
		public int hashCode() {
			return Objects.hash(nombre, apellidos, dNI);
		}

		//Equals propio
		
		public boolean equals(Object obj) {
			boolean igual = false;
			if( obj instanceof Persona2) {
				Persona2 otro = (Persona2) obj;
				if(this.dNI.equalsIgnoreCase(otro.getdNI())) {
					igual = true;
				} else {
					igual = false;
				}
			} else {
				igual = false;
			}
			return igual;
		}
}
