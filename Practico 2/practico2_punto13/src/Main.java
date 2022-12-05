import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Puesto puesto1 = new Puesto("Administrador");
		Puesto puesto2 = new Puesto("Gerente");
	
		Persona p1 = new Persona("Mirko", "Maciel", LocalDate.of(2001, 3, 9), puesto1);
		
		System.out.println(p1.toString());
		
	}
	
}
