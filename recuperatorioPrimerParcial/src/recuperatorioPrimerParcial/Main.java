package recuperatorioPrimerParcial;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random ran = new Random();

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();

		for (int i = 0; i < 30; i++) {
			alumnos.add(new Alumno("Alumno" + i, "Apellido" + i, 40000 + i));
		}

		for (int i = 0; i < 5; i++) {
			profesores.add(new Profesor("Profesor" + i, "Apellido profesor" + i, 2000 + i, 100 + i));
		}

		for (int i = 0; i < 5; i++) {
			materias.add(new Materia("Materia" + i, "ISO-CR-" + i, 2022, profesores.get(i)));
		}

		for (int i = 0; i < 5; i++) { // Ingresar almunos a materia
			for (int j = 0; j < ran.nextInt(3, 8); j++) {
				var aux = ran.nextInt(0, 30);
				materias.get(i).ingresarAlumno(alumnos.get(aux));
				alumnos.get(aux).ingresarNota(materias.get(i), ran.nextInt(0, 10));
			}
		}

		for (Materia materia : materias) { // 1)Los datos de cada materia, con su listado de alumnos
			System.out.println(materia.toString());
			System.out.println("Listado alumnos: ");
			materia.listadoAlumnos();
			System.out.print("\n\n");
		}
		System.out.print("\n\n");
		for (int i = 0; i < 10; i++) { //Los datos de 10 alumnos y sus materias
			var aux = ran.nextInt(0, 30);
			System.out.println(alumnos.get(aux).toString());
			alumnos.get(aux).imprimirHistorialAcademico();
			System.out.print("\n");
		}

	}

}
