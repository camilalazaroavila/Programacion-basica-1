package tp2punto6;

import java.util.Scanner;

import coche.Vehiculo;

public class EjemplosDeCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pre
		//post
		//static
		//static
		
		Scanner teclado= new Scanner(System.in);
		//teclado.next.in
		String mensaje =new String("Hola mundo");
		Vehiculo coche= new Vehiculo();
		coche.asignarColor("Azul");
		
		
		
		coche.setVelocidadMaxima(100);
		coche.aumentarVelocidad(5);
		System.out.println(coche.getVelocidadMaxima());
	
		System.out.println(Vehiculo.getNombre());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
