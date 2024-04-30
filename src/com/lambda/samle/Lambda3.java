package com.lambda.samle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Lambda3 {

	private static Random random = new Random();
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		List<String> arrList = new ArrayList<>(Arrays.asList(
				new String("Bob"),
				new String("Irene"),
				new String("Anna")));
		
		List<String> dupliList = new ArrayList<String>(arrList);
	
		
		dupliList.forEach(s -> System.out.println(s));
				
		dupliList.replaceAll(s -> s.replaceAll(s, s.toUpperCase()));
		
		dupliList.forEach(s -> System.out.println(s));
		
		dupliList.replaceAll(s -> s.replaceAll(s, s + " " + getRandomChar('A' , 'F') + "."));
		
		dupliList.forEach(s -> System.out.println(s));
		
		dupliList.replaceAll(s -> s.replaceAll(s, s + " " + reverseValue(s.split(" ")[0])));
		
		dupliList.forEach(s -> System.out.println(s));
		
		dupliList.removeIf(s -> s.split(" ")[0].equals(s.split(" ")[2]));
		
		System.out.println("===========================");
		dupliList.forEach(s -> System.out.println(s));
		//dupliList.replaceAll(s -> s.replaceAll(s, s + " " + "Rose" + ));
		
		//arrList.forEach(s -> Arrays.of.toUpperCase());
		
		//arrList.forEach(s -> System.out.println(s));
	}
	
	public static char getRandomChar(char startChar, char endChar) {
		return (char)random.nextInt((int) startChar,(int) endChar + 1);
	}
	
	public static String reverseValue(String firstName) {
		return new StringBuilder(firstName).reverse().toString();
	}

}
