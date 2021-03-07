package Calculadora;

public class Calculadora {
	
	public static int suma(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static void main(String[] args) {
		int a = 9;
		int b = 3;
		
		System.out.print(Calculadora.suma(a, b));
	}
}
