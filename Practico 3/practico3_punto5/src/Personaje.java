

public abstract class Personaje {

	private Integer vida;
	private Integer nivelAtaque;
	private Integer nivelDefensa;
	
	
	
	public Integer atacar() {
		return nivelAtaque;
	}
	
	public abstract void defender(Integer ataque);

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getNivelAtaque() {
		return nivelAtaque;
	}

	public void setNivelAtaque(Integer nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}

	public Integer getNivelDefensa() {
		return nivelDefensa;
	}

	public void setNivelDefensa(Integer nivelDefensa) {
		this.nivelDefensa = nivelDefensa;
	}

	@Override
	public String toString() {
		return " Vida: "+ vida + " | Ataque: " + nivelAtaque + " | Defensa: " + nivelDefensa;
	}
	
	
	
}
