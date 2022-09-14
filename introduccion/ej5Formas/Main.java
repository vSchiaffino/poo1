package ej5Formas;

public class Main {

	public static void main(String[] args) {
		Forma[] formas = new Forma[4];
		formas[0] = new Rectangulo(5, 10);
		formas[1] = new Cuadrado(5);
		formas[2] = new Circulo(10);
		formas[3] = new Triangulo(2, 5);
		
		for (Forma forma : formas) {
			System.out.println(String.format("%f", forma.calcularArea()));
		}
	}
}
