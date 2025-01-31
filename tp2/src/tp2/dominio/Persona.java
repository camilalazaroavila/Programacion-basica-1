package tp2.dominio;

public class Persona {
	private String nombre;
	private String genero;
	private int dni;
	private double peso;
	private double altura;
	private int anos;
	
	

	public Persona(String nombre, String genero, int dni, double peso, double altura, int anos) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.anos=anos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		
	}
	
	public void alimentar(double kilos) {
	this.peso =peso+kilos;
	}
	
	public void crecer(double cm) {
		this .altura= altura+cm;
	}

	public void cumplirAnos(int masAnos) {
		this.anos= anos+masAnos;
	}

}
