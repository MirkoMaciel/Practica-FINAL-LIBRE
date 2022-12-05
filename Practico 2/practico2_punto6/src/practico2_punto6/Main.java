package practico2_punto6;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Mirko", "Maciel", LocalDate.of(2001, 3, 9));
		Persona p2 = new Persona ("Santino", "Borda", LocalDate.of(2011, 9, 2));
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.println(p1.getNombre()+" tiene "+ p1.retornoEdad(p1.getFechaNacimiento())+" anios de edad");
		System.out.println(p1.getNombre()+" tiene "+ p2.retornoEdad(p2.getFechaNacimiento())+" anios de edad");

		
		
	}

}
