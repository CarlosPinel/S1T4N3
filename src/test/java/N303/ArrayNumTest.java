package N303;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

/*
*Una asserció que indiqui que dos arrays d'enters són idèntics.
*
*/

public class ArrayNumTest {

	@Test
	public void testArrayNum() {

		int[] numeros1 = new int[] {1,2,3,4,5,6};
		int[] numeros2 = new int[] {1,2,3,4,5,6};
		assertThat(numeros1).isEqualTo(numeros2);
	}

}
