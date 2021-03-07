package com.camacho.my.exercise_02;

import java.util.ArrayList;
import java.util.List;
/*LOOK AT THE NOTE IN THE METHOD TO-STRING*/
public class Main {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		
		Employee employee1 = new Employee(1, "heiz", "sistemas");
		Employee employee2 = new Employee(3, "heinrich", "sistemas");
		Employee employee3 = new Employee(5, "helmut", "rh");
		Employee employee4 = new Employee(4, "helga", "rh");
		Employee employee5 = new Employee(2, "heidi", "gerencia");
		Employee employee6 = new Employee(7, "amanda", "gerencia");
		Employee employee7 = new Employee(9, "marie", "administracion");
		Employee employee8 = new Employee(11, "rudolf", "administracion");
		Employee employee9 = new Employee(6, "herman", "sistemas");
		
		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		employee.add(employee4);
		employee.add(employee5);
		employee.add(employee6);
		employee.add(employee7);
		employee.add(employee8);
		employee.add(employee9);
		//only map allows me to use a specific method for every position in the collection
		employee.stream()
			//gets every employee whose department is IT
			.filter(x -> x.getDepartamento().equals("sistemas"))
			.forEach(System.out::println);
	}
}
