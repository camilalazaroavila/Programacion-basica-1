package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws DivisionPorCeroException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		// Elija una opcion
		System.out.println("0- salir");
		System.out.println("1- suma");
		System.out.println("2- resta");
		System.out.println("3- multiplicación");
		System.out.println("4- división");
		System.out.println("5- esPositivo ");
//		System.out.println("6- suma");
//		System.out.println("7- suma");
		int opcion = teclado.nextInt();

//		while (opcion != 0) {
			// Calculadora2 Calculadora = new Calculadora2();
			System.out.println("Ingrese el operador 1:");
			double operador1 = teclado.nextDouble();
			System.out.println("Ingrese el operador2:");
			double operador2 = teclado.nextDouble();

			Calculadora2 SegundaCalculadora = new Calculadora2(operador1, operador2);

			switch (opcion) {
				case 1:
					double resultado = SegundaCalculadora.sumar();
					System.out.println("Mostrar suma sin parametros:" + resultado);
					break;
				case 2:
					double resultado1 = SegundaCalculadora.restar();
					System.out.println("\nMostrar resta sin parametros: " + resultado1);
					break;
				case 3:
					System.out.println("\nMostrar multiplicacion sin parametros: " + SegundaCalculadora.multiplicar());
					break;
				case 4:
					System.out.println("Division sin parametros: " + SegundaCalculadora.dividir());
					break;
				case 5:
					System.out.println("operador 1: " + SegundaCalculadora.esPositivo((int) operador1));
					System.out.println("operador 2: " + SegundaCalculadora.esPositivo((int) operador2));
					break;
			}

//		}
//	
//		if (opcion == 1) {
//			// metodo sin parametros
//			double resultado = SegundaCalculadora.sumar();
//			System.out.println("Mostrar suma sin parametros:" + resultado);
//
////			// metodo con parametros
////			System.out.println("Ingrese el operador 1: ");
////			operador1 = teclado.nextDouble();
////			System.out.println("Ingrese el operador2");
////			operador2 = teclado.nextDouble();
////
////			resultado = SegundaCalculadora.sumar(operador1, operador2);
////			System.out.println("Mostrar suma con parametros: " + resultado);
//		}
//
//		if (opcion == 2) {
//			// restamos
//			// sin
//			double resultado = SegundaCalculadora.restar();
//			System.out.println("\nMostrar resta sin parametros: " + resultado);
////			// con
////			System.out.println("Ingrese operador 1:");
////			operador1 = teclado.nextDouble();
////			System.out.println("Ingrese operador 2 :");
////			operador2 = teclado.nextDouble();
////			resultado = SegundaCalculadora.restar(operador1, operador2);
////			System.out.println("Mostrar resta con parametros:" + resultado);
//
//		}
//
//		if (opcion == 3) {
//			// multiplicamos
//			System.out.println("\nMostrar multiplicacion sin parametros: " + SegundaCalculadora.multiplicar());
//
////			System.out.println("Ingrese operador 1 :");
////			operador1 = teclado.nextDouble();
////			System.out.println("Ingrese operador 2: ");
////			operador2 = teclado.nextDouble();
////
////			System.out.println(
////					"Resultado multiplicacion con parametros: " + SegundaCalculadora.multiplicar(operador1, operador2));
//
//		}
//
//		if (opcion == 4) {
//			// dividimos
//			System.out.println("Division sin parametros: " + SegundaCalculadora.dividir());
//
////			System.out.println("Ingrese operador 1:");
////			operador1 = teclado.nextDouble();
////			System.out.println("Ingrese operador2:");
////			operador2 = teclado.nextDouble();
////
////			System.out.println("Division con parametros: " + SegundaCalculadora.dividir(operador1, operador2));
//
//		}
//		if (opcion == 5) {
//			System.out.println("operador 1: " + SegundaCalculadora.esPositivo((int) operador1));
//			System.out.println("operador 2: " + SegundaCalculadora.esPositivo((int) operador2));
//		}
//		// pi x radio al cuadrado -> area de un circulo
//		System.out.println("Para calcular el area de un circulo, ingrese su radio:");
//		double radio = teclado.nextDouble();
//		double pi = Math.PI;
//
//		double areaCirculo = pi * (radio * radio);
//		System.out.println("El area del circulo es: " + areaCirculo);

	}

}
