package coche;

public class Vehiculo {
	String modelo;
	char tipoDeCaja;
	int cantidadDePuertas;
	boolean tipoDeGama;
	boolean estaEncendido;
	String color;
	double velocidadMaxima;

	public Vehiculo(String modelo, char tipoDeCaja, int cantidadDePuertas, boolean tipoDeGama, boolean estaEncendido,
			String marca) {

		this.modelo = modelo;
		this.tipoDeCaja = tipoDeCaja;
		this.cantidadDePuertas = cantidadDePuertas;
		this.tipoDeGama = tipoDeGama;
		this.estaEncendido = estaEncendido;
		this.marca = marca;
	}

//constructores
//se encarga de garantizar que un objeto de esta clase
//contien info necesaria para el bune fucionamiento

	public Vehiculo() {
	}

	String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public char getTipoDeCaja() {
		return tipoDeCaja;
	}

	public void setTipoDeCaja(char tipoDeCaja) {
		this.tipoDeCaja = tipoDeCaja;
	}

	public int getCantidadDePuertas() {
		return cantidadDePuertas;
	}

	public void setCantidadDePuertas(int cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}

	public boolean isTipoDeGama() {
		return tipoDeGama;
	}

	public void setTipoDeGama(boolean tipoDeGama) {
		this.tipoDeGama = tipoDeGama;
	}

	public boolean isEstaEncendido() {
		return estaEncendido;
	}

	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int aumentarVelocidad) {
		this.velocidadMaxima=aumentarVelocidad;
	}

	public void asignarColor(String nuevoColor) {
		this.color = nuevoColor;
	}

	public void aumentarVelocidad(int aumentaVelocidad) {
		this.velocidadMaxima = velocidadMaxima + aumentaVelocidad;

	}
	public final static String getNombre() {
		return "hola";
	}
	
	
	
	
	
}
