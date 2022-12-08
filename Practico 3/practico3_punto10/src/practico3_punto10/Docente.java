package practico3_punto10;

public class Docente extends Empleado{
	
	private String categoria;
	
	public Docente(String nombre, String apellido, Integer antiguedad, String sector, Double cantidadHoras, String categoria) {
		super(nombre, apellido, antiguedad, sector, cantidadHoras);
		// TODO Auto-generated constructor stub
		this.categoria=categoria;
		
	}


	@Override
	public String toString() {
		return "Docente: "+	 super.toString() + " | Categoria: "+ categoria;
	}


	
	
}
