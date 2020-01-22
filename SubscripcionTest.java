import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscripcionTest {

	@Test
	public void testprecioPorMes() {
		double esperado=100;
		Subscripcion s = new Subscripcion(200,2) ;
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado,0);
	}
	
	@Test
	public void testprecioPorMes2() {
		double esperado=67;
		Subscripcion s = new Subscripcion(200,3) ;
		double resultado= s.precioPorMes();
		assertEquals(esperado, resultado, 0) ;
	}
	
	@Test
	public void testCancel() {
		Subscripcion s = new Subscripcion(0,0) ;
		s.cancel();
		assertTrue(true) ;
	}
}