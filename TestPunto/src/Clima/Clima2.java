package Clima;

public class Clima2 {
	private double valorX;
	private double valorY;
	
	public void Climaa(double valorX, double valorY ) {

		this.valorX = valorX;
		this.valorY = valorY;
	}

	public double getValorX() {
		return valorX;
	}

	public void setValorX(double valorX) {
		this.valorX = valorX;
	}

	public double getValorY() {
		return valorY;
	}

	public void setValorY(double valorY) {
		this.valorY = valorY;
	}
	
	public boolean estaSobreElEjeX() {
	 return this.valorY == 0;
	}
	
	public boolean estaSobreElEjeY() {
		return this.valorX ==0;
	}
	
	public boolean estaSobreElOrigenCoordenadas() {
		return this.valorX == 0 && this.valorY ==0;
	}

	
	
	
}

