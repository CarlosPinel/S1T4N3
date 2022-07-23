package N301;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Una asserció que demostri que el valor de dos objectes sencers és igual, i
 * una altra que indiqui que no ho és.
 */

public class Persona1Test {

	@Test
	public void testEqual() {
		Persona1 p1 = new Persona1("Pablo", "Ramirez", "12345678X");
		Persona1 p2 = new Persona1("Pablo", "Ramirez", "12345678X");
		int resultado = (p1.toString().compareTo(p2.toString())); 
		assertThat(resultado).isIn(0);
		
	}

	@Test
	public void testNotEqual() {
		Persona1 p1 = new Persona1("Pablo", "Ramirez", "12345678X");
		Persona1 p2 = new Persona1("Pablo", "Gonzalez", "12345678X");
		int resultado = (p1.toString().compareTo(p2.toString())); 
		assertThat(resultado).isNotIn(0);
		
	}
}
