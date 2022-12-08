package ejemploArrayList;

import java.util.ArrayList;

public class Niño extends Persona {

	private String escuela;
	private Integer añosEscuela;
	private	ArrayList<Juego> juegos = new ArrayList<Juego>(); //Juego tiene su to.String()
	
	
	public Niño(String nombre, String apellido, Integer edad, String escuela, Integer añosEscuela) {
		super(nombre, apellido, edad);
		this.escuela = escuela;
		this.añosEscuela = añosEscuela;
	}


	@Override
	public String toString() {
		return "Niño: "+ super.toString() +" | Escuela: "+  escuela + " Años restantes: " + añosEscuela+ " "; 
	}
	
	
	
	
	
	
}
