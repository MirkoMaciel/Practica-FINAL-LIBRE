package recuperatorioPrimerParcial;

import java.util.ArrayList;

public class Materia {

	private String nombre;
	private String codigo;
	private Integer anio;
	private Profesor profesor;
	private ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
	
	public Materia(String nombre, String codigo, Integer anio, Profesor profesor) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.anio = anio;
		this.profesor = profesor;
	}
	
	public void ingresarAlumno(Alumno alumno) {
		this.listaAlumno.add(alumno);
	}
	
	public void listadoAlumnos() {
		for (Alumno alumno : listaAlumno) {
			System.out.println(alumno.toString());
		}
	}

	public ArrayList<Alumno> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	public String impresion() {
		return "Materia: " + nombre + " | Codigo: " + codigo;
	}
	
	@Override
	public String toString() {
		return "Materia: " + nombre + " | Codigo: " + codigo + " | Anio: " + anio + " | Profesor: " + profesor
				+ " | \nListado alumnos: ";
	}
	
	
	
}
