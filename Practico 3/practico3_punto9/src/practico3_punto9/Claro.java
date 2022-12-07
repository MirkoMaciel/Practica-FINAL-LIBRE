package practico3_punto9;

public class Claro extends TarifaProveedor{

	public Claro(Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
		super(totalSMS, totalMinutos, totalGigas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPago() {
		return super.calcularPago()+ (super.calcularPago()*20)/100;
	}

	//Polimorfismo dinamico
	
}
