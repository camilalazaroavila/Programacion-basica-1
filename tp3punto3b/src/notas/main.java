package notas;

import notas.dominio.Notas;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notaPrimerParcial = 3;
		int notaSegundoParcial = 8;
		Notas notas = new Notas(notaPrimerParcial);

		System.out.println("La nota es: " + notas.getValor());

		System.out.println(notas.estaAprobado());
		
		notas.setValor(notaSegundoParcial);
		
		System.out.println("La nota es: " + notas.getValor());

		System.out.println(notas.estaAprobado());
	}
}
