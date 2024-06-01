package notas.dominio;

public class Notas {

	int valor;

	public Notas(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;

	}

	public String estaAprobado() {
		// que de verdadero si el valor es mas grande q 7
		// para los metodos uso return
		// si tngo this, hago atributo nuevo
		//
		// return valor > 7;
		if (valor > 7) {
			return "Aprobado";

		} else {
			return "Desaprobado";
		}
	}
}
