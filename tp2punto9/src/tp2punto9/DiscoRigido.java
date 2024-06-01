package tp2punto9;

public class DiscoRigido {

	int tamaño;

	// contructor
	// inyecci+ón de dependencias por constructor
	// (o sea para funcionar necesita minimo un paramentro, en este caso)
	public DiscoRigido(int tamaño) {
		this.tamaño = tamaño;
	}
//
//	public double getCantidadDeDVD() {
//		// 1TB -> ? 1000GB
//		// El disco está en TB y los otros en GB
//		// al TB * 1000
//		double tamanioGB = this.tamaño * 1000;
//
//		// 4.5GB -> 1 DVD
//		// tamaño del disco -> ? DVD
//		return Math.floor(tamanioGB * 1 / 4.5);
//	}
//
//	public double getCantidadDeBlueray() {
//		double tamanioGB = this.tamaño * 1000;
//
//		// 25GB -> 1 Blue ray
//		// tamaño del disco -> ? DVD
//		return Math.floor((tamanioGB * 1) / 25);
//	}

	public double getCantidad(double otroTamanio) {
		double tamanioGB = this.tamaño * 1000;
		return Math.floor((tamanioGB * 1) / otroTamanio);
	}
}
