package tp3puntp13;

public class Ascensor {
	private int capacidadMaxima;
	private double pesoMaximo;
	private int pisoActual;
	private boolean puertaAbierta;
	private int pesoActual;
	private int capacidadActual;

	public Ascensor(int capacidadMaxima, double pesoMaximo) {
		this.capacidadMaxima = capacidadMaxima;
		this.pesoMaximo = pesoMaximo;

	}

	public int getPisoActual() {
		return pisoActual;
	}

	public void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}

	public int getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(int pesoActual) {
		this.pesoActual = pesoActual;
	}

	public void subirUnPiso() throws Exception {
		if(!puertaAbierta) {
			this.pisoActual++;			
		}
		else {
			throw new Exception("Debe cerrar la puerta");
		}

	}

	public void abrirPuerta() {
		this.puertaAbierta = true;

	}

	public void cerrarPuerta() {
		this.puertaAbierta = false;
	}

	public void subirPersona(int peso) throws Exception {
		//this.abrirPuerta();
		if(puertaAbierta) {
			// hay que verificar que el peso no supere el peso máximo
			// hay que verificar que la capacidad no supere la capacidad máxima
			this.pesoActual = pesoActual + peso;
			this.capacidadActual++;
			boolean isPesoPermitido = this.pesoActual<=this.pesoMaximo;
			boolean isCapacidadPermitida = this.capacidadActual<=this.capacidadMaxima;
			boolean estaHabilitadoElAscensor =  isCapacidadPermitida && isPesoPermitido;
			if(!estaHabilitadoElAscensor) {
				throw new Exception ("Supera la capacidad maxima " + pesoActual);
			}
		}	else{ 
			throw new Exception("La puerta esta cerrada");
		
		}
	
	}
}