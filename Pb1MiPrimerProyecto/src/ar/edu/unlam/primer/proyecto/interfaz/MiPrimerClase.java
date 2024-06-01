package ar.edu.unlam.primer.proyecto.interfaz;

public class MiPrimerClase {

	public static void main(String[] args) {

//VARIABLES
		//para numeros enteros
		byte numeroByte;
		
	
		numeroByte = 1;
 System.out.println("contenido de numeroByte: " +numeroByte ); //1
	System.out.println (numeroByte);
 
	numeroByte = 3;
 System.out.println("contenido de numeroByte: " +numeroByte );
 System.out.println("contenido de numeroByte: " +numeroByte );
 System.out.println("contenido de numeroByte: " +numeroByte );
 System.out.println("contenido de numeroByte: " +numeroByte ); 
 // el + concatena el contenido de la variable 
 numeroByte = 4;
 System.out.println("contenido de numeroByte: " +numeroByte );//4
 short numeroShort = 2; // deficion e inicialización
 System.out.println("contenido de numeroByte: " +numeroShort );
 int numeroInt = 5;

 long numerolong = 6;
	
	//conversion implicita
 numeroShort= numeroByte;
 //un Byte puede ser asignado a un grupo de Short porque estan dentro del msmo rango
 System.out.println("contenido de numeroByte: " +numeroByte );
	numeroShort = 128;
	
	//Conversion  explicita
	numeroByte = (byte)numeroShort;
	System.out.println("contenido de numeroByte: " +numeroByte );
	
	float numeroFloat =1.25f;
	double numeroDouble = 25.25;
	
	numeroFloat = (float) numeroDouble;
	
	
	numeroShort =5;
	numeroByte =3;
	
	//Operadores
	double resultado = numeroByte+ numeroShort;//suma
	System.out.println("Resultado " + resultado );
	
	 resultado = (numeroByte- numeroShort);//resta
	System.out.println("Resultado " - resultado );
	
	 resultado = (numeroByte* numeroShort);//multiplicacion
	System.out.println("Resultado " * resultado );
	
	resultado = (numeroByte/(float) numeroShort);// division
	System.out.println("Resultado: " / resultado );
	
	
	
	
	}

}
