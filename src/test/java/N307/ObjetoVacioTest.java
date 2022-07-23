package N307;

import java.util.Optional;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

/**
 * Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar que
 * efectivament està buit.
 *
 */

public class ObjetoVacioTest {

	Optional<Object> objectoVacio = Optional.empty();
	
	@Test
	public void test() {
		
		assertThat(objectoVacio).isEmpty();

	}

}
