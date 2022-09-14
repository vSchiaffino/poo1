package Piopio;

public class Piopio {
	private int energia;
	public Piopio() {
		this.energia = 0;
	}
	
	@Override
	public String toString() {
		return String.format("Soy pipio tengo %d energia", this.energia);
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
	
	private int calcularEnergiaAGastar(int kilometros) {
		return 10 + kilometros;
	}
}
