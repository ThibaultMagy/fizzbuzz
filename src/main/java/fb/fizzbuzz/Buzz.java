package fb.fizzbuzz;

public class Buzz implements Nombre{
	@Override
	public boolean isMultiple(int nombre) {
		return 0 == nombre % 5;
	}
	
}
