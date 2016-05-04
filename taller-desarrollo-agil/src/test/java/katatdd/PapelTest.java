package katatdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PapelTest {

	private Figura papel = new Papel();
	
	@Test
	public void papelContraPapelDeberiaSerEmpate(){
		assertThat(papel.contra(new Papel())).isNull();
	}
	
	@Test
	public void papelContraPiedraDeberiaGanarPapel(){
		assertThat(papel.contra(new Piedra())).isInstanceOf(Papel.class);
	}
	
	@Test
	public void papelContraTijeraDeberiaGanarTijera(){
		assertThat(papel.contra(new Tijera())).isInstanceOf(Tijera.class);
	}
}
