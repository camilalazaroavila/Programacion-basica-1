package actividad;

import java.util.Scanner;

public class actividad{

	
	public static void main(String[] args) {
	// defino varible
	
				Scanner teclado = new Scanner (System.in);

		
				
				System.out.println("Ingrese nota 1:");
				double notas = teclado.nextDouble();
				
				System.out.println("Ingrese nota 2:");
				double notas2 = teclado.nextDouble();
				
				System.out.println("Ingrese nota 3:");
				double notas3 = teclado.nextDouble();
				
				double promedio = (notas+ notas2+notas3)/3;
				System.out.println("Su promedio es:"+ promedio);

teclado.close();
	
	}

}
  