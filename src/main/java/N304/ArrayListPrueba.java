package N304;

import java.util.ArrayList;

public class ArrayListPrueba {


	public ArrayList<Object> generarLista() {

		ArrayList<Object> pruebaArrayList = new ArrayList<Object>();
		Object object1 = new Persona1("Pedro", "Perez", "123");
		Object object2 = "Alemania";
		Object object3 = new Coche("jaguar", 500);		
		Object object4 = 10000;
		pruebaArrayList.add(object1);
		pruebaArrayList.add(object2);
		pruebaArrayList.add(object3);
		pruebaArrayList.add(object4);
		return pruebaArrayList;
	}
}
