package practico3_punto10;

public class Empleado {

	private String nombre;
	private String apellido;
	private Integer antiguedad; //En años
	private String sector;
	private Double cantidadHoras; //Horas trabajadas

	public Empleado(String nombre, String apellido, Integer antiguedad, String sector, Double cantidadHoras) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.sector = sector;
		this.cantidadHoras = cantidadHoras;
	}

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

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Double getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(Double cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	@Override
	public String toString() {
		return  "Nombre completo: "+nombre +" "+ apellido + " | Antiguedad: " + antiguedad + " | Sector: "
				+ sector + " | Horas trabajadas: " + cantidadHoras;
	}	
	
	
		
	
	
}
