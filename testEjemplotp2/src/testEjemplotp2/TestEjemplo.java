package testEjemplotp2;

public class TestEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hamburgueseria hamburgueseria= new Hamburgueseria ("Mi Hambburgueseria",100);
	MenuPrincipal opcion= null;
	
	do {
		mostrarMenuPrincipal();
		opcion=ingresarOpcionDelMenu();
		switch() {
		case AGREGAR_HAMBURGUESA:
			
		break;
		case MODIFICAR_HAMBURGUESA:
		break;
		case ELIMINAR_HAMBURGUESA:
			break;
		case BUSCAR_HAMBURGUESA_POR_ID://
		break;
		case MOSTRAR_HAMBURGUESA_DE_UN_TIPO_DE_PAN://
		break;
		case MOSTRAR_LA_HAMBURGUESA_MAS_CARA://
		break;
		case MOSTRAR_PROMEDIO_DE_PRECIO_HAMBURGUESA_DE_UN_TIPO_DE_PAN://
		break;
		case MOSTRAR_PRECIO_TOTAL_HAMBURGUESAS:
			break;
		case SALIR:
			break;
		}
	}while !opcion.equals(MenuPrincipal.SALIR);
	
	}
	private static void mostrarMenuPrincipal() {
		// TODO Auto-generated method stub
		
	}
	private static MenuPrincipal ingresarOpcionDelMenu() {
		
	
	private static void mostrarMenuPrincipal() {
		for(int i=0; i <MenuPrincipal.values().length;i++) {
			System.out.println(i+1)+MenuPrincipal.values()[1]);
		}
		}
	}

}
