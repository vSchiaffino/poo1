package ej5Formas;

public class Triangulo extends Forma{
	double base;
	double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	double calcularArea() {
		return (this.base * this.altura) / 2;
	}
}
