

import java.util.Random;

public class Plebeyo extends Personaje {

	public Plebeyo() {
		super();
		this.setVida(200);
		this.setNivelAtaque(75);
		this.setNivelDefensa(0);
	}

	@Override
	public void defender(Integer ataque) {
		Boolean valor = true; // Determina booleana determina si el plebeyo se defendio con un cuchillo o no
		if (valor && new Random().nextBoolean()) {
			ataque = ataque - (ataque * 15) / 100;
			if (ataque < this.getVida()) {
				this.setVida(this.getVida()- ataque);
			} else System.out.println("El plebeyo murio");
		}

	}

	@Override
	public String toString() {
		return "Plebeyo "+super.toString();
	}
	
	

}
