package actividad3;

import java.util.Scanner;

public class actividad {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		//Debug Ejecuta el código pero podemos ver la ejecución de nuestro código fuente 
		// paso a paso es decir, linea a linea y si es unavariable, ver su contenido.
		// con el puntero sobre la variabl, el debuf muestra el conteido de la variable
		//f5 ejecutar una linea  sentencia de cogido 
		//f6 """", pero en presencia de algo odemos entrar
		//breakpoint  Indica donde el programa debe parar su función . se puede agregar un breakpoint
		//haciendo doble click sobre el nmero ed linea.
		//
		//resume: permite coniinuar ejecutando sentencias hasta llegar a otro breakpoint si no existe uno, ejecuta hasta el final del programa.
		
		
		
		
		// TODO Auto-generated method stub
// calcular el monto final de la operacion en base a el precio de las remeras por cantidad
		// cantidad de remeras, precio de cada remera-> variables -> datos de entradas
		int cantidadDeRemeras= 5;
		final double PRECIO_UNITARIO= 5000;
		final String MENSAJE_BIENVENIDA= "bienidos al calculador de precios";
		double MontoFinal=0;
		
		
		
		System.out.println("Ingrese cantidad de remeras:");
		cantidadDeRemeras = teclado.nextInt();
		
		//System.out.println("Ingrese el precio unitario de una remera:");
		//precioUnitario = teclado.nextDouble();
		
		//proceso
		MontoFinal = cantidadDeRemeras * PRECIO_UNITARIO;
		//salida->un monto final
		
		
	System.out.println("El monto final es:"+ MontoFinal);
		
		teclado.close();
		// no recibe nada y no necesita para funcionar
	}

	//private: modificador de acceso
	//void/double: no tiene valor de retorno, usamos void si no nos debe retornar nada
	//mostrarMnesajePorCONSOLA: NOMBRE DE METODO O FUNCIÓN, USAMOS camelCase
	//(): posee los parametro o argumentos que recibe el metodo para utilizar
	//{} definen el contexto, ambito o bloque del metodo, es decir lo que necesito para responder una operacón
	
	private void mostrarMnesajePorConsola (String mensaje) {
	System.out.println(mensaje);
	}
	public int sumar(int numerador, int denominador) {
		int resultado = numerador + denominador;
		{
	}
		return 0;
	}
	
	
	
}
