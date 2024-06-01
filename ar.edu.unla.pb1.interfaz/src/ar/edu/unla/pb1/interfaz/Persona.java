package ar.edu.unla.pb1.interfaz;

public class Persona {

	private String nombre;
	private String genero;
	private long dni;
	private double altura;
	private double peso;
	private int edad;
	private boolean viva;

public Persona (String nombre, String genero, long dni, double peso, double altura, boolean viva) {
	this.nombre= nombre;
	this.genero= genero;
	this.dni=dni;
	this.peso=peso;
	this.altura=altura;
	this.viva=viva;
}
public void Alimentar(double kilos) {
	this.peso +=kilos;
}
public void Creer(double metros) {
	this.altura += metros;{
	}



}


}
