package practico3_punto10;

import java.util.ArrayList;

public class Reloj {
	
	public Reloj () {
	
	}

	public void generarInforme(ArrayList<Empleado> empleado) {
		 
		for (Empleado var : empleado) {
			System.out.println(var.toString());
		}
	}
	
}
