package tp3punto5;

public class Punto {
	private double puntoX = 0;
	private double puntoY = 0;

	public Punto(double puntoX, double puntoY) {
this.puntoX= puntoX;
this.puntoY= puntoY;
	}

//consultar y cambiar coordenadas
	// saber si el punto esta sobre el eje x
	// """" y

	public double getPuntoX() {
		return puntoX;
	}

	public void setPuntoX(double puntoX) {
		this.puntoX = puntoX;
	}

	public double getPuntoY() {
		return puntoY;
	}

	public void setPuntoY(double puntoY) {
		this.puntoY = puntoY;
	}

	public boolean estaSobreEjeX(double ejeX) {
		// que va a ca? debajo de un metdo devulevo?
		//o direcamente va el condicional 
		
		return this.puntoX ==0;{
		if (puntoX == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean estaSobreEjeY(double ejeY) {
		if (puntoY == 0) {
			return true;
		} else {
			return false;
		}
	}
}
