package practico3_punto10;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		Reloj re = new Reloj();
		
		ArrayList<String> nombres = new ArrayList<String>(Arrays.asList("Mirko","Martin","Julio","Eduardo"
				,"Pedro", "Laura","Martina","Luna"));
		ArrayList<String> apellidos = new ArrayList<String>(Arrays.asList("Perez", "Da silva", "Maciel", "Juares",
				"Rodriguez", "Alquimes"));
		ArrayList<String> categorias = new ArrayList<String>(Arrays.asList("Simple","Semi-Exclusiva","Exclusiva"));
		ArrayList<String> jornadas = new ArrayList<String>(Arrays.asList("Completa","Reducida"));
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		Docente doc1 = new Docente("Facundo", "Rizzi", 0, "Vago", 0.0, "Simple");
		NoDocente nodoc1 = new NoDocente("Clauida", "Casas", 25, "Limpieza", 14.0, "Completa");
		
		for (int i = 0; i < 10; i++) {
			var aux = ran.nextInt(1,3);
			if (aux == 1) {
				empleados.add(new Docente (nombres.get(ran.nextInt(8)), apellidos.get(ran.nextInt(6)), 
						ran.nextInt(0,50),"Matematica" , ran.nextDouble(0.0 , 50.0), categorias.get(ran.nextInt(categorias.size()))));
			}else if (aux == 2) {
				empleados.add(new NoDocente (nombres.get(ran.nextInt(8)), apellidos.get(ran.nextInt(6)), 
						ran.nextInt(0,50),"Limpieza" , ran.nextDouble(0.0 , 50.0), jornadas.get(ran.nextInt(jornadas.size()))));
			}
		}
		
		empleados.add(doc1);
		re.generarInforme(empleados);
		
	
	}

}
