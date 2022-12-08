package recuperatorioPrimerParcial;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
//		ArrayList<Materia> materias = new ArrayList<Materia>();
//		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
//		
		for (int i = 0; i < 3; i++) {
			alumnos.add( new Alumno("Alumno"+i , "Apellido"+i, 40000+i));
		}
//		
//		for (int i = 0; i < 5; i++) {
//			profesores.add(new Profesor("Profesor"+i, "Apellido profesor"+i, 2000+i, 100+i) );
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			materias.add( new Materia("Materia"+i , "ISO-CR-"+i, 2022 , profesores.get(i), alumnos));
//		}
//		
		HistoriaAcademica ha = new HistoriaAcademica();
		Profesor pr =new Profesor("Profe", "Apellido", 100, 10000);
		Materia ma = new Materia("Materia", "100", 100, pr);
		
		Alumno al = new Alumno("Mirko", "Maciel", 100);
		//al.ingresarNota(ma,8);
		
		ma.ingresarAlumno(al);
		al.ingresarNota(ma, 8);
		
		System.out.println(al.toString());al.imprimirHistorialAcademico();
//		System.out.println(pr.toString());
		
		//System.out.println(ma.toString());ma.listadoAlumnos();
		
//		ha.agregarMateria(ma, 8);
//		ha.imprimirHistorial();
	}
	
}
