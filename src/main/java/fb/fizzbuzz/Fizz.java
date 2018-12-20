package fb.fizzbuzz;

public class Fizz extends Nombre{

	@Override
	public boolean isMultiple(int nombre) {
		return 0 == nombre % 3;
	}

}
