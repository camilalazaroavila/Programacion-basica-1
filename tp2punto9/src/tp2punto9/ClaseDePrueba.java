package tp2punto9;

public class ClaseDePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seagate = 10;
		int hitachi = 20;
		int westernDigital = 32;
		int toshiba = 48;
		

		final double dvd = 4.5;// GB
		final double blueRay = 25;// GB

		
		DiscoRigido disco = new DiscoRigido(seagate);

		
//		System.out.println(disco.getCantidadDeDVD());
//		System.out.println(disco.getCantidadDeBlueray());
		System.out.println("DVD: " + disco.getCantidad(dvd));
		System.out.println("Blue ray: " + disco.getCantidad(blueRay));
	}

}
