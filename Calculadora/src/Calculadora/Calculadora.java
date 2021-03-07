package Calculadora;

public class Calculadora {
	
	public static int suma(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static int resta(int a, int b) {
		int c = a - b;
		
		return c;
	}
	
	public static int multiplicacion(int a, int b) {
		int c = a * b;
		
		return c;
	}
	
	public static void main(String[] args) {
		int a = 9;
		int b = 3;
		
		System.out.print("Suma: " + Calculadora.suma(a, b));
		System.out.print("Resta: " + Calculadora.resta(a, b));
		System.out.print("Multiplicación: " + Calculadora.multiplicacion(a, b));

	}
}
