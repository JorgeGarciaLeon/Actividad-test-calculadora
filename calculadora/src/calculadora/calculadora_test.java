package calculadora;
import static org.junit.Assert.*;
import org.junit.Test;

public class calculadora_test {
	
	
	
	@Test
	public void testSuma() {
		calculadora calculadora = new calculadora(3f,2f);
		long resultado = (long) calculadora.sumar();
		long esperado = (long) 5f;
		assertEquals(esperado,resultado);
	}

	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testResta() {
		calculadora calculadora1 = new calculadora(3f,2f);
		long resultado = (long) calculadora1.restar();
		long esperado = (long) 1f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testMultiplicar() {
		calculadora calculadora2 = new calculadora(3f,2f);
		long resultado = (long) calculadora2.multiplicar();
		long esperado = (long) 6f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testAbsoluto() {
		calculadora calculadora3 = new calculadora(3f,2f);
		long resultado = (long) calculadora3.valorAbsoluto();
		long esperado = (long) 3f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testElevar() {
		calculadora calculadora4 = new calculadora(3f,2f);
		long resultado = (long) calculadora4.elevar();
		long esperado = (long) 9f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testPositivo() {
		calculadora calculadora5 = new calculadora(3f,2f);
		boolean resultado = calculadora5.esPositivo();
		boolean esperado = false;
		assertEquals(esperado, resultado);
	}
}
