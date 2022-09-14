package ej5Formas;

public class Circulo extends Forma{
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
}
