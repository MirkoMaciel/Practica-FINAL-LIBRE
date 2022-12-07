import java.util.Random;

public class Combate {

	private Plebeyo plebeyo;
	private Araña araña;

	public Combate(Plebeyo plebeyo, Araña araña) {
		super();
		this.plebeyo = plebeyo;
		this.araña = araña;
	}

	public void iniciarCombate() throws ExcepcionVidaZero {
		for (int i = 0; i < 10; i++) {
			var aux = new Random().nextInt(0,3);
			if (araña.getVida() == 0 || plebeyo.getVida() == 0) {
				throw new ExcepcionVidaZero("Batalla finalizada personaje sin vida."); //Arrojo la excepcion a esa clase
			}
			if (aux == 1) { // Ataca el plebeyo
				System.out.println("El plebeyo ataco a la araña con: "+plebeyo.getNivelAtaque());
				araña.defender(plebeyo.atacar());
				System.out.println("Araña vida actual: "+araña.getVida()+" Defensa: "+araña.getNivelDefensa()+"\n");
			} else if (aux == 2) {
				System.out.println("La araña ataco al plebeyo con: "+araña.getNivelAtaque());
				plebeyo.defender(araña.atacar());
				System.out.println("Plebeyo vida actual: "+plebeyo.getVida()+" Defensa: "+plebeyo.getNivelDefensa()+"\n");
			}
		
		}
	}
}
