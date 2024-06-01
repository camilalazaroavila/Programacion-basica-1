package Enumm;

public class EjercicioEnum {
private static final int INGRESAR_PERSONA=1;
private static final int VER_RESUMEN_PERSONAS=2;
private static final int SALIR=9;
	public static void main(String[] args) {
		
		int opcion=0;
		do {
			System.out.println("Ingrese la opcion");
		}
		
		
		
		MenuPrincipal opcionMenu=MenuPrincipal.INGRESAR_PERSONA;
		System.out.println(MenuPrincipal.INGRESAR_PERSONA);
		
		opcionMenu=MenuPrincipal.values()[1];
		System.out.println(opcionMenu);
		
		System.out.println(MenuPrincipal.SALIR.ordinal());
		
	
				
switch(opcion) {
case INGRESAR_PERSONA:
	ingresarPersona();
	break;
case VER_RESUMEN_PERSONAS:
	verResumen();
	break;
case SALIR:
	break;
}
	}
	
private static void mostarMenuPrincipal() {
	System.out.println(MenuPrincipal.values().length);
	
	for(int posicion =0;posicion <MenuPrincipal.values().length; posicion++) {
	
		opcion=MenuPrincipal.values()posicion];
	
	System.err.println(posicion+1)+"." opcion;
	}
	System.out.println("1. para ingresar persona\n2. Ver resumen de personas\n3 Salir");
	}


	private static void ingresarPersona(){
}
private static void verResumen(){
}
private static void salir() {
}}



