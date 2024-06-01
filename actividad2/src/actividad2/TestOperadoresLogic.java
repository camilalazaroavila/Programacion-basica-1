package actividad2;

import java.util.Scanner;

public class TestOperadoresLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner teclado = new Scanner(System.in);
 teclado.next();
 
 

 //camelCase- nombres de variables
 //PascalCase- clases
 //snakecase- no se usa
 
 /*System.out.println("Ingrese valor de verdad");
 boolean valorBoolean = teclado
 
 
 String texto =teclado.next();
 char caracter = teclado.next().charAt(0);//texto 0 hace resferencia a las T/ 1 a e
 double numeroDoueble = teclado.nextDouble();
 float numeroFloat = teclado.nextFloat();
 //tipo de dato <nombre de variable>
 */
 System.out.println("ingrese un nnumero para saber si es mayor a 1:");
 int numero= teclado.nextInt();
 
 boolean mayorAUno; // verdadero o false
 mayorAUno= true;
 mayorAUno= false;
 
 //operadores logicos
 
 mayorAUno = ( numero > 1);
 
 System.out.println("Es mayor a uno "+ mayorAUno );
 
 teclado.close();
	}

}
