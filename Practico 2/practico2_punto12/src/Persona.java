


import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de nacimiento: " + fechaNacimiento;
	}	

	public static Integer retornoEdad (LocalDate fecha) {
		LocalDate actual = LocalDate.now();
		Integer diaActual = actual.getDayOfMonth();
		Integer mesActual = actual.getMonthValue()-1;
		Integer anioActual = actual.getDayOfYear()+1683;
		//el AÑO del localDate arranca en el 339 por eso se le suma 1638 para el año actual
		//2022
		
		Integer diferencia = anioActual - fecha.getYear();
		
		if (mesActual <= fecha.getMonthValue()) {
			if (mesActual == fecha.getMonthValue()) {
				if (fecha.getDayOfMonth() > diaActual) {
					return diferencia--;
				}
			}
		}else {
			return diferencia--;
		}
		return diferencia;
		
	}
	

}
