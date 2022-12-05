import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa empresa1 = new Empresa("Coca Cola" , "Tehuelches 123");
		
		Persona p1 = new Persona("Mirko", "Maciel", LocalDate.of(2001, 3, 9));
		Persona p2 = new Persona("Santino", "Borda", LocalDate.of(2011, 9, 2));
		Persona p3 = new Persona("Jorge", "Perez", LocalDate.of(1990, 7, 1));
		Persona p4 = new Persona("Claudio", "Aqruimedes", LocalDate.of(2000, 2, 23));
		Persona p5 = new Persona("Elio", "Ortiga", LocalDate.of(1967, 12, 29));
		
		empresa1.addIntegrante(p1);
		empresa1.addIntegrante(p2);
		empresa1.addIntegrante(p3);
		empresa1.addIntegrante(p4);
		empresa1.addIntegrante(p5);
		
		empresa1.informacionEmpleados();System.out.println();
		System.out.println("La cantidad de empleados en la empresa es: "+empresa1.listadoEmpleados());
	
		Persona p6 = new Persona("Elba", "Gordillo", LocalDate.of(1950, 1, 1));
		empresa1.addIntegrante(p6);System.out.println();
		empresa1.informacionEmpleados();System.out.println();
		System.out.println("La cantidad de empleados en la empresa es: "+empresa1.listadoEmpleados());
		
	}
	

}
