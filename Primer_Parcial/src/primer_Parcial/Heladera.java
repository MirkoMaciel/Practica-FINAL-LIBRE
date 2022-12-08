package primer_Parcial;

public class Heladera extends Electrodomestico{

	private Integer capacidadTotal;
	private Integer capacidadFreezer;
	
	
	public Heladera(String modelo, Double precio, String marca, String color, Integer capacidadTotal, Integer capacidadFreezer) {
		super(modelo, precio, marca, color);
		// TODO Auto-generated constructor stub
		this.capacidadTotal= capacidadTotal;
		this.capacidadFreezer=capacidadFreezer;
	}


	@Override
	public String toString() {
		return "Heladera: "+ super.toString() + " | Capacidad total: "+ capacidadTotal + " | Capacidad Freezer: " + capacidadFreezer;
	}


	
	
	
	
	
}
