package ch16.sec01;

public class CalculableImpl implements Calculable {

	@Override
	public void calculate(int x, int y) {
		int result = x + y;
		System.out.println("result: " + result);
	}

	
}
