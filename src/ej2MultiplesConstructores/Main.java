package ej2MultiplesConstructores;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Persona con constructor de edad
		Persona unaPersona = new Persona("Valentín", 18);
		unaPersona.saludar();
		// Persona con constructor de año de nacimiento
		Date nacimiento = new Date(1998, 10, 18);
		Persona otraPersona = new Persona("Eduardo", nacimiento);
		otraPersona.saludar();
	}

}
