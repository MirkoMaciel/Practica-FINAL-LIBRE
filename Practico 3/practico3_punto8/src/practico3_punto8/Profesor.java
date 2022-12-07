package practico3_punto8;

public abstract class Profesor {

	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer horasTrabajadas;
	private Double valorHora=0.0;
	
	
	public Profesor(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.horasTrabajadas = horasTrabajadas;
	}

	public abstract Double getRemuneracionPorAntiguedad();
		
	public abstract Double getRemuneracionMensual();
	
			
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido + " | Edad: " + edad + " | Horas de trabajo: "
				+ horasTrabajadas + " | Valor por hora: " + valorHora;
	}
	
	

	


}
