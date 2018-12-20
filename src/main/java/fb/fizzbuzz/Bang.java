package fb.fizzbuzz;

public class Bang implements Nombre{
	@Override
	public boolean isMultiple(int nombre) {
		return 0 == nombre % 7;
	}

}
