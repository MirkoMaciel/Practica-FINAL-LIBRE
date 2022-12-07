package practico3_punto8;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ProfesorTitular> titulares = new ArrayList<ProfesorTitular>();
		titulares.add(new ProfesorTitular("Aldana", "Gutierrez", 40, 40, 15));
		titulares.add(new ProfesorTitular("Pedro", "Perez", 30, 30, 4));
		titulares.add(new ProfesorTitular("Maria", "Gomez", 29, 40, 1));

		ArrayList<ProfesorSuplente> suplentes = new ArrayList<ProfesorSuplente>();
		suplentes.add(new ProfesorSuplente("Tomas", "Sosa", 28, 40));
		suplentes.add(new ProfesorSuplente("Luciana", "Torres", 35, 10));

//		for (int i = 0; i < titulares.size(); i++) {
//			System.out.println(
//					"Nombre y apellido: " + titulares.get(i).getNombre() + " " + titulares.get(i).getApellido());
//			System.out.println("Es titular? Si");
//			System.out.println("Remuneración:" + titulares.get(i).getRemuneracionMensual());
//		}
//		for (int i = 0; i < suplentes.size(); i++) {
//			System.out.println(
//					"Nombre y apellido: " + suplentes.get(i).getNombre() + " " + suplentes.get(i).getApellido());
//			System.out.println("¿Es titular?: No");
//			System.out.println("Remuneración:" + suplentes.get(i).getRemuneracionMensual());
//		}
		
		System.out.println("TITULARES:");
		for (int i = 0; i < titulares.size(); i++) {
			System.out.println(titulares.get(i).toString());
			System.out.println("Remuneracion: " + titulares.get(i).getRemuneracionMensual());
		}
	
		System.out.println("\nSUPLENTES: ");
		for (int i = 0; i < suplentes.size(); i++) {
			System.out.println(suplentes.get(i).toString());
			System.out.println("Es titular? No");
			System.out.println("Remuneracion: " + suplentes.get(i).getRemuneracionMensual());
		}
		
	}

}
