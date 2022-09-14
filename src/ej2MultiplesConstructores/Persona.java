package ej2MultiplesConstructores;
import java.util.Date;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, Date nacimiento) {
		int añoActual = 2022;
		this.nombre = nombre;
		this.edad = añoActual - nacimiento.getYear();
	}
	
	public void saludar() {
		System.out.println(String.format("Hola! Soy %s y tengo %d años.", this.nombre, this.edad));
	}
}
		