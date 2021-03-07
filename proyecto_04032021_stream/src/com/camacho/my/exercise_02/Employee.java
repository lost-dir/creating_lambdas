package com.camacho.my.exercise_02;

public class Employee {
	
	private int edad;
	private String nombre;
	private String departamento;
 
	public Employee() {
		 
	}
	 
	public Employee(int edad, String nombre, String departamento) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	//only to string method will retrieve an string for the stream in the main class
	//it is important to declare this method, otherwise it will throw the space in memory reference on the console
	@Override
	public String toString() {
		return "Employee [edad=" + edad + ", nombre=" + nombre + ", departamento=" + departamento + "]";
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
