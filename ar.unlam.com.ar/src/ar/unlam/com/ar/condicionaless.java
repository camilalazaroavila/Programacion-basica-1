package ar.unlam.com.ar;

public class condicionaless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coche auto=new coche("Toyota","Fiat", 1234,1234,52222);
		System.out.println("El vehiculo es un "+auto.getMarca()+""+auto.getModelo());
		System.out.println("El vehiculo cuenta con un"+auto.getKilometros()+"kilometros");
		System.out.println("Tiene un precio de $" +auto.getPrecio());
		
		System.out.println("El vehiculo tiene una antiguedad de"+auto.calcularAntiguedad()+"años");
	}

}
