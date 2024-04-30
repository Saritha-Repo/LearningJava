package com.lambda.samle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result =  Calculator((a, b)-> a+ b, 4,5);
		
		System.out.println("Value of the Operation " + result);
		
		var r1 = Calculator((a,b) -> a/b, 6.2, 4.1);
	
		System.out.println("Value of the Operation " + r1);
		
		var result3 = Calculator((a,b) -> a.toUpperCase() + " " +  b.toUpperCase(), "Irene","Rose");
		System.out.println("Value of the Operation " + result3);
		
		var cords  = Arrays.asList(new double[] {47.26,20.45},
				new double[] {30.5,10.3});
		
		cords.forEach(s -> System.out.println(Arrays.toString(s)));
		
		List<String> stringList = new ArrayList<>(Arrays.asList(
				new String("Saritha"), new String("Bijoy")));
		
		stringList.forEach(s -> System.out.println(s));
		stringList.removeIf(s -> s.equalsIgnoreCase("saritha"));
		stringList.forEach(s -> System.out.println(s));
		
		//Challenge 1 
		Consumer<String> printThepart = s -> {
			Arrays.asList(s.split(" ")).forEach(s1 -> System.out.println(s1));
		};
		printThepart.accept("Challenge 1, Split the content into arrays " );
		
		//Challenge 2	
		UnaryOperator<String> secondChar = s -> {
			StringBuilder returnVal= new StringBuilder();
			for(int i=0;i< s.length();i++) {
				if(i%2 == 1) {
					returnVal.append(s.charAt(i));
				}
			}
			return returnVal.toString();		
		};
		//System.out.println(secondChar.apply("1234567890"));
		
		System.out.println(everySecondCharacter(secondChar, "1234567890"));
		//Challenge 3
		
		Supplier<String> iLoveJava = () -> "I Love Java";
		
		System.out.println(iLoveJava.get());
		
	}

	public static <T> T Calculator(BinaryOperator<T> operation, T value1, T value2) {
		T result = operation.apply(value1, value2);
		
		
		
		return result;
	}
	

	//Challenege 2
	
	public static String everySecondCharacter(UnaryOperator<String> secondChar, String source) {
		 return (secondChar.apply(source));
		
	}
	
	
}
