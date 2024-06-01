package MiPrimeraClase;

import java.util.Scanner;

public class MiPrimerClasee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	

	// Pedir al usuario que ingrese el primer número
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();

    // Pedir al usuario que ingrese el segundo número
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();
    scanner.close();
	/*
	 1- Promociona si ambas notas son mayores o iguales a 7
	 2- Aprobados si ambas notas son mayores o iguales a 4 (al menos una es menor a 7)
	 3- Desaprobado si alguna de las notas es menor a 4
	 NO SE PUEDE UTILIZAR NINGUNA ESTRUCTURA LOGICA PARA RESOLVERLO
	 La salida puede ser  promociono false, aprobo true, desaprobo false
	 */
	
    // 1- si numero 1 es mayor o igual a 7 y si numero 2 es mayor o igual a 7
    boolean promociona = numero1 >= 7 && numero2 >= 7; 
    
    // 2- (si numero 1 es mayor o igual a 4 y si numero 2 es mayor o igual a 4)
    // y ademas numero 1 o numero 2 tiene que ser menor a 7
    boolean aprobado = (numero1 >= 4 && numero2 >= 4) && (numero1 < 7 || numero2 < 7);
//    boolean aprobado = (numero1 >= 4 && numero2 >= 4) && !(numero1 > 7 && numero2 > 7);

    // 3- si numero 1 es menor a 4 o numero 2 es menor a 4 
    boolean desaprobado = numero1 < 4 || numero2 < 4;
    
    /* Casos de prueba
     1- 7 y 7 true false false ok 
     2- 7 y 5 false true false ok
     3- 4 y 4 false true false ok
     4- 4 y 3 false false true ok
     */
    
    System.out.println("Promociona: " + promociona + " , Aprueba: " + aprobado + " , Desaprueba: " + desaprobado);
	
	return;
	}
}
