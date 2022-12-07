 

import java.util.Random;

public class Araña extends Personaje {

	public Araña() {
		super();
		this.setVida(150);
		this.setNivelAtaque(60);
		this.setNivelDefensa(75);
	}

	@Override
	public void defender(Integer ataque) {

		if (new Random().nextInt(0, 100) > 20) { // Recibir el golpe
			if (this.getNivelDefensa() > 0) {
				if (this.getNivelDefensa() < ataque) {
					ataque = ataque - this.getNivelDefensa();
					this.setNivelDefensa(0);
				}
			} if (this.getVida() > 0) {
				if (ataque > this.getVida()) {
					this.setVida(0);
					System.out.println("El personaje arania murio");
				}else this.setVida(this.getVida() - ataque);
			}
		} // Probabilidad de no recibirlo es del 40%
	}

	@Override
	public String toString() {
		return "Arania"+ super.toString();
	}
	


}
