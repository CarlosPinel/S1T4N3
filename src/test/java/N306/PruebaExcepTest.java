package N306;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. Crea una
 * asserció que validi que l'excepció és llançada quan correspon.
 *
 */

public class PruebaExcepTest {
	
	@Test
	public void test() {
		
		// cuando
		Throwable thrown = catchThrowable(() -> {
			PruebaExcep p = new PruebaExcep();
			p.ArrayIndexException();
		});

		// entonces
		assertThat(thrown)
		  .isInstanceOf(ArrayIndexOutOfBoundsException.class);
	}
}
