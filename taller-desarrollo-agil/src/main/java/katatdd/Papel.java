package katatdd;


public class Papel implements Figura{

	public Figura contra(Papel papel) {
		return null;
	}

	public Figura contra(Piedra piedra) {
		return new Papel();
	}

	public Figura contra(Tijera tijera) {
		return new Tijera();
	}

	@Override
	public Figura contra(Figura figura) {
		return figura.contra(this);
	}

}
