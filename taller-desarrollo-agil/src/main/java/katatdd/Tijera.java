package katatdd;

public class Tijera implements Figura {

	public Figura contra(Tijera tijera) {
		return null;
	}

	public Figura contra(Piedra piedra) {
		return new Piedra();
	}

	public Figura contra(Papel papel) {
		return new Tijera();
	}

	@Override
	public Figura contra(Figura figura) {
		return figura.contra(this);
	}

}
