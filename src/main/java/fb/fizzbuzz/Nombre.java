package fb.fizzbuzz;

public abstract class Nombre {
	private int nombre;
	public abstract boolean isMultiple(int nombre);
	public abstract int setNombre();
	public void setNombre(int nombre) { this.nombre = nombre; }
}
