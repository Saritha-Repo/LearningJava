package com.lambda.samle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda1 {

	record Person(String firstName, String lastName) {
		
		@Override
		public String toString(){
			return firstName + " " + lastName;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> person = new ArrayList<>(Arrays.asList(
				new Person("Saritha","Sebastian"),
				new Person("Bijoy","Baby"),
				new Person("Irene Rose","Bijoy")));
		
		//System.out.println(person);
	

		/*
		 * Comparator<Person> compLastName = new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { // TODO Auto-generated
		 * method stub return o1.lastName().compareTo(o2.lastName()); } };
		 * person.sort(compLastName);
		 */
	
	person.sort((o1,o2) -> o1.lastName().compareTo(o2.lastName()));
	
	//System.out.println(person);
	
	List<String> asStrigList = new ArrayList<>(List.of("New Zealand","Austrilia","USA"));
	
	asStrigList.forEach(s -> System.out.println(s));
	asStrigList.forEach((var s) -> {
		char c= s.charAt(0);
		System.out.println(s + " First char " + c);
	});
	}
}
