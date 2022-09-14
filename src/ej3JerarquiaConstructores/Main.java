package ej3JerarquiaConstructores;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro("Simón", "Labrador");
		perro.saludar();
		Perro otroPerro = new Perro();
		otroPerro.saludar();
	}

}
