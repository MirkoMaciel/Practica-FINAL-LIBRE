package practico3_punto8;

public class ProfesorSuplente extends Profesor {

	public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super(nombre, apellido, edad, horasTrabajadas);
		// TODO Auto-generated constructor stub
		this.setValorHora(200.0);
	}

	@Override
	public Double getRemuneracionPorAntiguedad() {
		return null;
	}
	
	@Override
	public Double getRemuneracionMensual() {
		// TODO Auto-generated method stub
		return this.getValorHora() * this.getHorasTrabajadas();
	}

	@Override
	public String toString() {
		return "Profesor Suplente: "+super.toString();
	}

	
	
	
}
