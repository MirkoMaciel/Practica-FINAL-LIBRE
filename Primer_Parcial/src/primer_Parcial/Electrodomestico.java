package primer_Parcial;

import java.text.DecimalFormat;

public class Electrodomestico {
	
	private String modelo;
	private Double precio;
	private String marca;
	private String color;
	
	DecimalFormat df = new DecimalFormat("#.00"); //Limito los decimales del precio
	
	public Electrodomestico(String modelo, Double precio, String marca, String color) {
		super();
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return  modelo + "| Precio: " + df.format(precio) + " | Marca: " + marca + "  | Color: " + color;
	}


	
	
}
	