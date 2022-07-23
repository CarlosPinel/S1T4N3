package N305;

import java.util.HashMap;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

/**
 * Crea un map i verifica que conté una de les key que li afegeix.
 *
 */

public class EjercicioMapTest {

	EjercicioMap m = new EjercicioMap();
	HashMap<String,String> mapTest = m.generarMap();
	
	@Test
	public void test() {

		assertThat(mapTest).containsKey("England");
	}

}
