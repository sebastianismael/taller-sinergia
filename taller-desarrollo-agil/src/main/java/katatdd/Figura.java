package katatdd;


public interface Figura {

	Figura contra(Piedra piedra);

	Figura contra(Papel papel);

	Figura contra(Tijera tijera);

	Figura contra(Figura figura);
}
