package Piopio;

public class Piopio {
	private int energia;
	private int posicion;

	public Piopio() {
		this.energia = 0;
		this.posicion = 0;
	}
	
	public Piopio(int posicionInicial)
	{
		this.energia = 0;
		this.posicion = posicionInicial;
	}
	
	@Override
	public String toString() {
		return String.format("Soy pipio tengo %d energia y estoy en el km %d", this.energia, this.posicion);
	}
	
	public boolean puedeIr(int kilometro)
	{
		int distanciaARecorrer = this.calcularDistancia(kilometro);
		int energiaAGastar = this.calcularEnergiaAGastar(distanciaARecorrer);
		return (energiaAGastar <= this.energia);
	}
	
	public void irAKilometro(int kilometro)
	{
		if(this.puedeIr(kilometro))
		{
			int distanciaARecorrer = this.calcularDistancia(kilometro);
			this.volar(distanciaARecorrer);
			this.setPosicion(kilometro);			
		}
	}
	
	public void comer(int gramosComidos)
	{
		this.energia += gramosComidos * 4;
	}
	
	public void volar(int kilometros)
	{
		int energiaAGastar = this.calcularEnergiaAGastar(kilometros);
		if(this.energia >= energiaAGastar)
		{
			this.energia -= energiaAGastar;			
		}
	}
	
	private int calcularDistancia(int kilometro)
	{
		return Math.abs(posicion - kilometro);
	}
	
	private int calcularEnergiaAGastar(int kilometros) {
		return 10 + kilometros;
	}
	
	private void setPosicion(int posicion)
	{
		this.posicion = posicion;
	}
}
