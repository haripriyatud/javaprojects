package interfaces;

public interface Calculation {
    int  a=10;
	int b= 5;
	public int add(int a, int b);
	public int subract(int a, int b);
	public int multiply(int a, int b);
	public int division(int a, int b);
	public default void printMessage(){ 
		System.out.println("Default method from the interface is executed");
	}	

}
