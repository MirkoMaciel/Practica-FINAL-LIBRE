package ejemploArrayList;


public class Adulto extends Persona {

	private Integer aniosAporte;
	private String tituloUniversitario;
	
	public Adulto(String nombre, String apellido, Integer edad, Integer aniosAporte, String tituloUniversitario) {
		super(nombre, apellido, edad);
		this.aniosAporte = aniosAporte;
		this.tituloUniversitario = tituloUniversitario;
	}

	@Override
	public String toString() {
		return "Adulto "+ super.toString()+" | Años de aporte: "+ aniosAporte + " | Titulo Universitario: " + tituloUniversitario;
	}
	
	
	
	
}
