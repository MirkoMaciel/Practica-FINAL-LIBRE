package primer_Parcial;

public class Cocina extends Electrodomestico {

	private String tipoCocina;

	public Cocina(String modelo, Double precio, String marca, String color, String tipoCocina) {
		super(modelo, precio, marca, color);
		// TODO Auto-generated constructor stub
		this.tipoCocina=tipoCocina;
		
	}

	public String getTipoCocina() {
		return tipoCocina;
	}

	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}

	
	
	@Override
	public String toString() {
		return "Cocina: "+super.toString() +" | Tipo cocina: "+ tipoCocina;
	}
	
	
	
	
}
