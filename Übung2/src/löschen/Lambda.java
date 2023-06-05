package löschen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream; 
import java.util.stream.Collectors;

public class Lambda {
	
	public interface Funktion {
		
		int apply(int a, int b);
	}

	public static void main(String[] args) {

		Funktion f = (a,b) -> a*b;
		int i = f.apply(2, 3);
		
		System.out.println(i);
		
		
		IntPredicate auto = (a) ->  a> 18;
		System.out.println("alt genuug "+  auto.test(21));
		
		
		List<String> teilnehmerliste = Arrays.asList("Zink", "Sommer", "Winter", "Herbst","Kupfer");
		 
		OptionalDouble tollesErgebnis = teilnehmerliste.stream().mapToInt(name -> name.length()).average();
		tollesErgebnis.ifPresent ( avg -> System.out.println(avg));
		
		teilnehmerliste.stream().filter(name -> name.startsWith("W")).map(name -> name.toUpperCase()).forEach(System.out::println);
	
		Optional<String> sensation = teilnehmerliste.stream().reduce( (A, B) -> A.length() >= B.length() ? A : B);
		sensation.ifPresent(se -> System.out.println(se));
		
		System.out.println( teilnehmerliste.stream().mapToInt(name -> name.length()).sum());
		
		teilnehmerliste.stream().sorted().forEach(System.out::println);
		
		List<Integer> zahl = Arrays.asList(2,3,4,4,21,123);
		
		int summe = zahl.stream().reduce(0,(a,b) -> a+b);
		System.out.println(summe);
		
	
	}

}
