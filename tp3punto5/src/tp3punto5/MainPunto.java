package tp3punto5;

import java.util.Scanner;

public class MainPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto pruebaPunto = new Punto();
		Scanner teclado = new Scanner(System.in);
		int opcion= teclado.nextInt();

		pruebaPunto.setX(opcion);

		System.out.println(pruebaPunto.getY());
		System.out.println(pruebaPunto.getX());
	
teclado.close();
}
}
