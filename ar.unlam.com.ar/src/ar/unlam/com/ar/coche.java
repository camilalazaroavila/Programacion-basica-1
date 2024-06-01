package ar.unlam.com.ar;

public class coche {

private int ANIO_ACTUAL;
private int CERO_KM;
private String marca;
private String modelo;
private int kilometros;
private int ano;
private double pecio;

//CONSTRUCTORES
public coche ( String marca, String modelo, double precio) {
this.marca= marca;
this.modelo=modelo;
this.setPrecio(precio);

}
private void setPrecio(double precio) {
	// TODO Auto-generated method stub
	
}
public coche(String marca, String modelo, int kilometros, int ano, double precio) {
	this.marca= marca;
	this.modelo=modelo;
	this.setKilometros(kilometros);
	this.ano=ano;
	this.setPrecio(precio);

}
private void setKilometros(int kilometros2) {
	// TODO Auto-generated method stub
	
}
public static int getCantidadCoches() {
	return cantidadCoches;
}
public void setKilometros(int kilometros) {
	this.kilometros= kilometros;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(doduble precio) {
	this.precio= precio;
}
public int getKilometros() {
	return kilometros;
}
private String getMarca() {
	// TODO Auto-generated method stub
	return null;
}
private String getModelo() {
	// TODO Auto-generated method stub
	return null;
}
}
