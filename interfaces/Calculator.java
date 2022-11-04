package interfaces;

public class Calculator implements Calculation{



	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subract(int a, int b) {
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}
	
	@Override
	public void printMessage() {
		System.out.println("This is executed from the main class");
	}
	
	
	

	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(calc.a,calc.b));
		System.out.println(calc.subract(5, 7));
		System.out.println(calc.multiply(5, 7));
		System.out.println(calc.division(5, 7));
		calc.printMessage();


		
		
		

	}
}
