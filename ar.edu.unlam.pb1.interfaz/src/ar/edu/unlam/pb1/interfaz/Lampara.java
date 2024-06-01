package ar.edu.unlam.pb1.interfaz;

public class Lampara {

	// ATRIBUTOS
		private boolean encendido;
		private int cantidadDeVecesEncendida;
		
		//CONSTRUCTOR
		public Lampara () {
			this.encendido=false;
			this.cantidadDeVecesEncendida=0;
		}
		
		//METODOS
		public void encender () {
			this.encendido=true;
			this.cantidadDeVecesEncendida++;
		}
		
		public void apagar () {
			this.encendido=false;
		}
		
		public void setEncendido(boolean encendido) {
			this.encendido=encendido;
		}

		public int getCantidadDeVecesEncendida() {
			return cantidadDeVecesEncendida;
		}

		public void setCantidadDeVecesEncendida(int cantidadDeVecesEncendida) {
			this.cantidadDeVecesEncendida = cantidadDeVecesEncendida;
		}

		public boolean isEncendido() {
			return encendido;
		}
}
