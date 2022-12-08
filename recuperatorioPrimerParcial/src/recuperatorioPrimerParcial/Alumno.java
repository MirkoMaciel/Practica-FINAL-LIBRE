package recuperatorioPrimerParcial;

public class Alumno extends Persona{

	private HistoriaAcademica historial = new HistoriaAcademica();

	public Alumno(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		
	}
	
	public void ingresarNota(Materia materia , Integer nota) {
		historial.agregarMateria(materia, nota);
	}
	
	public void imprimirHistorialAcademico() {
		historial.imprimirHistorial();
	}

	@Override
	public String toString() {
		return "Alumno: "+ super.toString()+ " | ";
	}

	public HistoriaAcademica getHistorial() {
		return historial;
	}

	public void setHistorial(HistoriaAcademica historial) {
		this.historial = historial;
	}

	
}
