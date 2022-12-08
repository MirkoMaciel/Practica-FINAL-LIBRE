package practico3_punto10;

public class NoDocente extends Empleado {

	private String tipoJornada;

	public NoDocente(String nombre, String apellido, Integer antiguedad, String sector, Double cantidadHoras, String tipoJornada) {
		super(nombre, apellido, antiguedad, sector, cantidadHoras);
		// TODO Auto-generated constructor stub
		this.tipoJornada= tipoJornada;
		
	}

	@Override
	public String toString() {
		return "No docente: "+ super.toString() +" | Tipo de jornada: " + tipoJornada;
	}
	
	
	

}
