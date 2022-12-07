package practico3_punto4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Araña araña1 = new Araña();
		Plebeyo plebeyo1 = new Plebeyo();

		
		System.out.println(	araña1.toString());
		System.out.println(plebeyo1.toString());
	
		System.out.println("Ataque infligido: ");
		araña1.defender(new Random().nextInt(0,2260));
		plebeyo1.defender(new Random().nextInt(0,250));
		
		System.out.println(araña1.toString());
		System.out.println(plebeyo1.toString());
		

	}

}
