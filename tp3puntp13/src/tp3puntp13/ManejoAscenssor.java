package tp3puntp13;

public class ManejoAscenssor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Ascensor consorcioCallePeron = new Ascensor(4, 150.0);
		Persona Juan = new Persona(60);
		Persona Maria = new Persona(80);
		Persona Ludmila = new Persona(90);

		System.out.println(consorcioCallePeron.getPisoActual());

		consorcioCallePeron.subirUnPiso();
		consorcioCallePeron.subirUnPiso();
		consorcioCallePeron.subirUnPiso();
		System.out.println(consorcioCallePeron.getPisoActual());
	
	System.out.println(consorcioCallePeron.getPesoActual());
	consorcioCallePeron.abrirPuerta();
	consorcioCallePeron.subirPersona(Juan.getPeso());
	consorcioCallePeron.subirPersona(Maria.getPeso());
	consorcioCallePeron.subirPersona(Ludmila.getPeso());
	
	System.out.println(consorcioCallePeron.getPesoActual());
	consorcioCallePeron.cerrarPuerta();
	consorcioCallePeron.subirUnPiso();
	
	}

}
