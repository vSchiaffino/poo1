package ej3JerarquiaConstructores;

public abstract class Animal {
	private String nombre;
	public Animal(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
