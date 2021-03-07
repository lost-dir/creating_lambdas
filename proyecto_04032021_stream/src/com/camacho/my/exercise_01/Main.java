package com.camacho.my.exercise_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import javax.xml.stream.events.Namespace;

//import java.util.HashMap;

public class Main {
	
	Random random = new Random();

	public static void main(String[] args) {
		Main main = new Main();
		//implementing stream to a returning value
		main.getNames().stream()
			//prevents duplicated values to show up
			.distinct()
			//it filters a search value, the value is passed as a lambda expression
			.filter(x -> x.equals("Carlos"))
			//this way we can print results in console
			.forEach(System.out::println);
	}
	
	public List<String> getNames() {
		List<String> names = new ArrayList<>();
		names.add("Jaime");
		names.add("María");
		names.add("Josue");
		names.add("Diana");
		names.add("Julia");
		names.add("Carlos");
		names.add("Carlos");
		names.add("Carlos");
		names.add("Carlos");
		names.add("Carlos");
		names.add("Carlos");
		names.add("Raquel");
		names.add("Gustavo");
		names.add("Roberto");
		names.add("Roberto");
		names.add("Roberto");
		return names;
	}
}
