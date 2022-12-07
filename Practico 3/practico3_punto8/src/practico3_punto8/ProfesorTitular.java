package practico3_punto8;

public class ProfesorTitular extends Profesor {

	private Integer antiguedad;
	private final Double valorAntiguedad = 1000.0;
	
	
	public ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad) {
		super(nombre, apellido, edad, horasTrabajadas);
		// TODO Auto-generated constructor stub
		this.setValorHora(300.0);
		this.antiguedad=antiguedad;
	}


	@Override
	public Double getRemuneracionPorAntiguedad() {
		return this.valorAntiguedad * this.getAntiguedad();
	}

	@Override
	public Double getRemuneracionMensual() {
		// TODO Auto-generated method stub
		return (this.getValorHora() * this.getHorasTrabajadas()) +
				this.getRemuneracionPorAntiguedad();
	}


	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Double getValorAntiguedad() {
		return valorAntiguedad;
	}


	@Override
	public String toString() {
		return "Profesor Titular: " +super.toString()+ " | Antiguedad: "+ antiguedad + " | Valor por antiguedad: " + valorAntiguedad;
	}

	
	
	
}
