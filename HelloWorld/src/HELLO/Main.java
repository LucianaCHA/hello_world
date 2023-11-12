package HELLO;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Transform {
	String toUpperCase(String word);
}

public class Main {
	// Metodo encargado de operar una lista de palabras
	public static List<String> transformWordList(List<String> words, Transform transform) {
		List<String> uppercasedList = new ArrayList();

		// A cada palabra de la lista se le aplica el upper y se lo agrega a la lista
		for (String word : words) {
			uppercasedList.add(transform.toUpperCase(word));
		}
		return uppercasedList;
	}

	public static void main(String[] args) {
		List<String> wordsList = List.of("hola", "soy", "luciana", "mate", "jengibre");

		// Creo la interfaz funcional encargada de modificar las palabras

		Transform toUpper = (word) -> word.toUpperCase();

		// Llamo al metodo operar y le paso la lista de palabras para uppercasear

		List<String> result = transformWordList(wordsList, toUpper);
		System.out.println(result);
	}
}
