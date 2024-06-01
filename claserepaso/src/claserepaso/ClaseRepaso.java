package claserepaso;

import java.util.Scanner;

public class ClaseRepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese base");

double base= teclado.nextDouble();

System.out.println("altura:");
double altura=  teclado.nextDouble();
teclado.close();

double perimetro = calcularPerimetro(base, altura);
double area = calcularArea(base, altura);

System.out.println("El perímetro del paralelogramo es: " +perimetro);
System.out.println("El área del paralelogramo es: " + area);
	}

	private static double calcularArea(double base, double altura) {
		double resultado =(base*altura);
		return resultado;
	}

	private static double calcularPerimetro(double b,double a) {
		double resultado=(b*a)+ (b*a);
		return resultado;
		
	}

}
