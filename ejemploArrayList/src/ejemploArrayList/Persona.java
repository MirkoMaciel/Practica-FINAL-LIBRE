package ejemploArrayList;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private Integer edad;

	public Persona(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " | Apellido: " + apellido + " | Edad: " + edad;
	}
	


	
	
	
}
