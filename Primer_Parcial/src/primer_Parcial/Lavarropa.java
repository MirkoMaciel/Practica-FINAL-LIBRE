package primer_Parcial;

public class Lavarropa extends Electrodomestico{

	private String tipoCarga;
	private Integer capacidadKilos;
	
	public Lavarropa(String modelo, Double precio, String marca, String color, String tipoCarga, Integer capacidadKilos) {
		super(modelo, precio, marca, color);
		this.tipoCarga= tipoCarga;
		this.capacidadKilos=capacidadKilos;
		
	}

	@Override
	public String toString() {
		return "Lavarropa: "+super.toString() +" | Tipo de carga: "+ tipoCarga + " | Capacidad Kilos: " + capacidadKilos;
	}

	
	
	
	
}
