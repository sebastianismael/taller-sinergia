package katatdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TijeraTest {

	private Figura tijera = new Tijera();
	
	@Test
	public void tijeraContraTijeraDeberiaSerEmpate(){
		assertThat(tijera.contra(new Tijera())).isNull();
	}
	
	@Test
	public void tijeraContraPiedraDeberiaGanarPiedra(){
		assertThat(tijera.contra(new Piedra())).isInstanceOf(Piedra.class);
	}
	
	@Test
	public void tijeraContraPapelDebriaGanarTijera(){
		assertThat(tijera.contra(new Papel())).isInstanceOf(Tijera.class);
	}
}
