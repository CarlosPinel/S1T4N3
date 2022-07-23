package N305;

import java.util.HashMap;

/**
 * Crea un map i verifica que conté una de les key que li afegeix.
 *
 */

public class EjercicioMap {

	public HashMap<String, String> generarMap() {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		return capitalCities;
	}
}
