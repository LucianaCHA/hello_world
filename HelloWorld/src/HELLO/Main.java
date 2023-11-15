package HELLO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	//link repo https://github.com/LucianaCHA/hello_world/tree/clase_3/HelloWorld/src
	//EJERCICIO 1
	//Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
	//lista con los strings en mayúscula
	public static List<String> StringListToUpperCase (List<String> words) {
		return words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
		
	}
	
	//EJERCICIO 2
	//Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
	//método debe devolver un String que concatene separando por coma y espacio todas las
	//palabras, en la lista, que tengan más de "n" caracteres.
	
	public static List<String> filterLongerThan(List<String> wordsList, int minLength){
		
		return wordsList.stream().filter(word-> word.length() > minLength).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		List<String> wordsList = List.of("hola", "soy", "luciana", "mate", "jengibre");
		
		List<String> wordsList2 = List.of("marie", "Curie", "RBert", "reid", "Salvat");
		
		

		System.out.println(StringListToUpperCase(wordsList));
		System.out.println(StringListToUpperCase(wordsList2));
		
		System.out.println(filterLongerThan(wordsList2, 4));

	}
}
