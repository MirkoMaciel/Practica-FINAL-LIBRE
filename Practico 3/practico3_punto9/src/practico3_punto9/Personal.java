package practico3_punto9;

public class Personal extends TarifaProveedor {

	public Personal(Integer totalSMS, Integer totalMinutos, Integer totalGigas) {
		super(totalSMS, totalMinutos, totalGigas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMinutos() {
		// TODO Auto-generated method stub
		return super.calcularMinutos() + ((super.calcularMinutos()*20)/100 );
	}

	@Override
	public Double calcularGiga() {
		// TODO Auto-generated method stub
		return super.calcularGiga() + (super.calcularGiga()*50 ) / 100;
	}


	
}
