package Piopio;

public class Main {

	public static void main(String[] args) {
		Piopio piopio = new Piopio(122);
		piopio.comer(25);
		
		System.out.println(piopio);
		System.out.println(String.format("puedo ir a mar del plata? %b", piopio.puedeIr(400)));
	}

}
