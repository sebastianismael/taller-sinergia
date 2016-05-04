package katatdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PiedraTest {

	private Figura piedra = new Piedra();
	
	@Test
	public void piedraContraPiedraDeberiaSerEmpate() {
		assertThat(piedra.contra(new Piedra())).isNull();
	}

	@Test
	public void piedraContraPapelDeberiaGanaerPapel(){
		assertThat(piedra.contra(new Papel())).isInstanceOf(Papel.class);
	}
	
	@Test
	public void piedraContraTijeraDeberiaGanarTijera(){
		assertThat(piedra.contra(new Tijera())).isInstanceOf(Piedra.class);
	}
}
