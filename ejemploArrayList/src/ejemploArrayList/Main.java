package ejemploArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		for (int i = 0 ; i < 5 ; i++) {
			personas.add(new Adulto("Adulto"+i , "Apellido"+i, 30+i, 15+i, "Falopero"));
			personas.add( new Niño ("Ninio"+i, "Apellido"+i, 10+i ,"Dean funes", 1+i));
		}
		
		for (Persona x : personas) {
			System.out.println(	x.toString());
		}
		
	}

}
