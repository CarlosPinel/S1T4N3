package N302;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

/**
 * Una asserció que demostri que la referència a un objecte és la mateixa que
 * una altra, i una altra que indiqui que és diferent.
 */

public class Persona2Test {

		
		@Test
		public void testEqual() {
			Persona2 p1 = new Persona2("Pablo", "Ramirez", "12345678X");
			Persona2 p2 = p1;
			assertThat(p1).isSameAs(p2);
		}

		@Test
		public void testNotEqual() {
			Persona2 p1 = new Persona2("Pablo", "Ramirez", "12345678X");
			Persona2 p2 = new Persona2("Pablo", "Ramirez", "87654321P");
			assertThat(p1).isNotSameAs(p2);
		}
	}
