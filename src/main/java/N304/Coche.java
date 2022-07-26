package N304;

public class Coche {

	private String nombre;
	private int potencia;
	
	public Coche(String nombre, int potencia) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
