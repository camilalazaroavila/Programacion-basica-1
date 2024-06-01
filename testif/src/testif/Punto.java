package testif;

public class Punto {
private final int CUADRANTE_UNO=1;
private final int CUADRANTE_DOS=2;
private final int CUADRANTE_TRES=3;
private final int CUADRANTE_CUATRO=4;

//getter y setter de cada punto2
	//saber si el punto esta sobre x =0
	//saber si esta sobre el eje de las y=0
	
	//averiguar en q cuadrante esta el punto
	//c1: x e y positivos
	//c2: x negativo e y psotivios
	//c3 x e y negativos
	//cuadrantes4 x positivo e y negativo
	
	private int coordenadaX;
	private int coordenadaY;
	 
	public Punto(int coordenadaX,int coordenadaYy) {
		this.coordenadaX =coordenadaX;
		this.coordenadaY= coordenadaY;
		
	}
	public void setCoordenadasX(int coordenadaX) {
		this.coordenadaX=coordenadaX;
	}
	public int getCoordenadaX() {
		return this.coordenadaX;
		
	}
	public void setCoordenadaY(int coordenadaY) {
	this.coordenadaY=coordenadaY;
	}
	public int getCoordenadaY() {
		return this.coordenadaY;
	}
	public boolean estaSobreElEjeX() {
		boolean estaSobreElEjeX=false;
		
		if(this.coordenadaY==0) {
			estaSobreElEjeX=true;
		
		return this.coordenadaY==0;
		}
	}public boolean estaSobreElEjeY() {
		if(this.coordenadaX==0) {
			return true;
		}
		return this.coordenadaX==0;
	}
	public boolean estaEnElOrigenDeCoordenadas() {
		return this.estaEnElEjeCeroCero();
		
	}
	private boolean estaEnElEjeCeroCero() {
		return this.coordenadaX== 0&& this.coordenadaY ==0;
	}
	public int cuadranteDelPunto() {
		int cuadrante=0;
		if (this.estaEnElCuadranteUno()==true) {
			cuadrante=CUADRANTE_UNO;
		}
		
		
		return cuadrante;
		
	}
	private boolean estaEnElCuadranteUno() {
		return this.coordenadaX> 0 && this.coordenadaY>0;
				
	}
	private boolean estaEnElCuadranteDos() {
		return this.coordenadaX> 0 && this.coordenadaY>0;
	}
	
	private boolean estaEnElCuadranteTres() {
		return this.coordenadaX> 0 && this.coordenadaY<0;
	}}

