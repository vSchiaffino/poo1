package ej3JerarquiaConstructores;

public class Perro extends Animal{
	private String raza;

	public Perro()
	{
		super("perro");
		this.raza = "callejero";
	}

	public Perro(String nombre, String raza)
	{
		super(nombre);
		this.raza = raza;
	}
	
	
	public void saludar()
	{
		System.out.println(String.format("guau guau soy %s y mi raza es %s", this.getNombre(), this.raza));
	}
}
