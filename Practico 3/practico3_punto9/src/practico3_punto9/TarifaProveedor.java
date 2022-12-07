package practico3_punto9;

public abstract class TarifaProveedor {

	private Integer totalSMS;
	private Integer totalMinutos;
	private Integer totalGigas;
	private final Double valorMensaje = 1.0;
	private final Double valorLlamada= 15.0;
	private final Double valorGiga=20.0;
	
	
	public TarifaProveedor(Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
		super();
		this.totalSMS = totalSMS;
		this.totalMinutos = totalMinutos;
		this.totalGigas = totalGigas;
	}
	
	public Double calcularSMS() { //Valor en pesos que se debe pagar por totalSMS
		return totalSMS * valorMensaje;
	}
	
	public Double calcularMinutos() {
		return totalMinutos * valorLlamada;
	}
	
	public Double calcularGiga() {
		return totalGigas * valorGiga;
	}
	
	public Double calcularPago() {
		return calcularMinutos() + calcularSMS() + calcularGiga();
	}
	
	
}
