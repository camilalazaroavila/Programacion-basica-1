package tp3punto6;

public class Cuenta {
	double saldo = 0;

	public Cuenta() {

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// b. Solo es posible extraer un
	// importe menor o igual al saldo
	// que se tenga en la cuenta.

	// esperar a q seba me diga
	// crear metodo tirando tipo s de datps q i guess
	// devuelvo algo?
	// if so ez

	// si el importe es menor o igual al saldo, extraigo
	// sino al q quiere celeste que le cueste

	public String extraerDinero(int cantidadDeSaldo) {

		if (cantidadDeSaldo <= saldo) {
			return "Extracción exitosa";
		} else {
			return "Lo sentimos, no se pudo realizar esa operación";
		}
	}
}