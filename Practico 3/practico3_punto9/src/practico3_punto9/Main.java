package practico3_punto9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Claro celular1 = new Claro(20,20,20);
		Personal celular2= new Personal(20,20,20);
		Movistar celular3= new Movistar(20,20,20);
		
		System.out.println("CELULARES CLARO: ");
		System.out.println("Total a pagar: "+celular1.calcularPago());
	
		System.out.println("CELULARES PERSONAL: ");
		System.out.println("Total a pagar: "+celular2.calcularPago());
		
		System.out.println("CELULARES MOVISTAR: ");
		System.out.println("Total a pagar: "+celular3.calcularPago());
	}

}
