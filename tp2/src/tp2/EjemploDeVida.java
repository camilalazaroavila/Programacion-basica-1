package tp2;

import tp2.dominio.Persona;

public class EjemploDeVida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona sofia = new Persona("Sofia", "mujer", 38432153, 2.8, 0.50, 20);
		System.out.println(sofia);

		System.out.println(sofia.getPeso() + " kg");

		System.out.println(sofia.getAltura() + "cm");

		sofia.alimentar(1.0);
		System.out.println(sofia.getPeso() + "kg");

		sofia.crecer(0.5);
		System.out.println(sofia.getAltura());

		sofia.cumplirAnos(5);
		System.out.println(sofia.getAnos() + "como MILA");
		System.out.println(sofia.getNombre().toUpperCase());

		String teclado = "Sebastian ";
		System.out.println(teclado.toLowerCase());
		System.out.println(teclado.toUpperCase());
		System.out.println(teclado.trim());
		System.out.println(teclado.toLowerCase().trim());
		System.out.println(teclado.charAt(2));
		System.out.println(teclado.trim().length());

	}

}
