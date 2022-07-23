package N306;

/**
 * Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. Crea una
 * asserció que validi que l'excepció és llançada quan correspon.
 *
 */

public class PruebaExcep {

	public int[] ArrayIndexException() {

		int[] array = new int[] {};
		int num = array[1];
		return array;
	}
}