package calculadora;

//Definición de la excepción personalizada
class DivisionPorCeroException extends Exception {
	public DivisionPorCeroException(String mensaje) {
		super(mensaje);// usa el constructor de tu papá
	}
}

public class Calculadora2 {

	// atributos
	private double operador1;
	private double operador2;

	// constructores
	public Calculadora2() {
	}

	public Calculadora2(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	// metodos

	public double sumar() {
		return this.operador1 + this.operador2;
	}

	public double sumar(double num1, double num2) {
		return num1 + num2;
	}

	// Sin parametros
	public double restar() {
		return this.operador1 - this.operador2;
	}

	// con parametros
	public double restar(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicar() {
		return this.operador1 * this.operador2;
	}

	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public double dividir() throws DivisionPorCeroException {
		if (this.operador2 == 0) {
			throw new DivisionPorCeroException("Error: División por cero no está permitida. Cami >:v");
		}
		return this.operador1 / this.operador2;
	}

	public double dividir(double num1, double num2) throws DivisionPorCeroException {
		if (num2 == 0) {
			throw new DivisionPorCeroException("Error: División por cero no está permitida. Cami >:v");
		}
		return num1 / num2;

	}

	// con parametro
	public boolean esPositivo(int numeroR) {
		// this.operador1= numeroR; // el caso sin parametros
		// con parametros (numeroR)
		if (numeroR > 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * public static boolean esPositivo2(int numeroR) { return numeroR > 0; }
	 */

}
