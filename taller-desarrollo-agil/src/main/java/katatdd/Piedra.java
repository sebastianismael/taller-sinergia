package katatdd;

public class Piedra implements Figura{

	public Figura contra(Piedra piedra) {
		return null;
	}

	public Figura contra(Papel papel) {
		return new Papel();
	}

	public Figura contra(Tijera tijera) {
		return new Piedra();
	}

	@Override
	public Figura contra(Figura figura) {
		return figura.contra(this);
	}

}
