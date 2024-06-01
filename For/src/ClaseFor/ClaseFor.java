package ClaseFor;

import java.util.Scanner;

public class ClaseFor {

	public static void main(String[] args) {

		Scanner teclado= new Scanner (System.in);
				int cantidadDeAlunos =3;
		int totalizador=0;
		for (int i=1; i<=cantidadDeAlumnos;i++) {
			int nota = teclado.nextInt();	
			System.out.println("ingrese la nota del alumno"+i+1);

totalizador +=nota;
		}
	}
	double promedio=(double) totalizador/cantidadDeAlumnos;{
	System.out.println("el promedio es" + promedio);
	
	
	
	
	}
}
