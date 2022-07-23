package N304;

import java.util.ArrayList;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també).
 * Escriu una asserció per a verificar l'ordre dels objectes en l'ArrayList
 * segons han estat inserits.
 * 
 * Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
 * Verifica que, en la llista anterior, un dels objectes s'ha afegit només una
 * vegada. Deixa un dels elements sense afegir, i verifica que la llista no
 * conté aquest últim.
 *
 */

public class ArrayListTest {

	ArrayListPrueba n = new ArrayListPrueba();
	ArrayList<Object> pruebaArrayList2 = n.generarLista();
	Object object1 = pruebaArrayList2.get(0);
	Object object2 = pruebaArrayList2.get(1);
	Object object3 = pruebaArrayList2.get(2);
	Object object4 = pruebaArrayList2.get(3);
	Object object5 = "Ola de calor";
	
	@Test
	public void testArrayList1() {
		
		assertThat(pruebaArrayList2).containsExactly(object1, object2, object3, object4);
		}
	
	@Test
	public void testArrayList2() {
		
		assertThat(pruebaArrayList2).contains(object4,object2,object3,object1);
	}
	
	
	@Test
	public void testArrayList3() {
		
		assertThat(pruebaArrayList2).containsOnlyOnce(object3);
	}
	
	@Test
	public void testArrayList4() {
		
		assertThat(pruebaArrayList2).doesNotContain(object5);
	}
}