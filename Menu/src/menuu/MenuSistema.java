package menuu;

import java.util.Scanner;

public class MenuSistema{

	 public enum OpcionMenu {
	        INGRESAR_AL_SISTEMA,
	        CONSULTAR_PERFIL,
	        VER_MATERIAS_APROBADAS,
	        VER_PLAN_DE_ESTUDIO,
	        INSCRIBIRSE_A_MATERIAS,
	        VER_MATERIAS_DISPONIBLES,
	        INSCRIBIRSE_A_UNA_MATERIA,
	        VOLVER,
	        REGISTRARSE,
	        SALIR
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        OpcionMenu opcion;

	        do {
	            mostrarMenuPrincipal();
	            opcion = obtenerOpcion(scanner);

	            switch (opcion) {
	                case INGRESAR_AL_SISTEMA:
	                    ingresarAlSistema(scanner);
	                    break;
	                case REGISTRARSE:
	                    registrarse();
	                    break;
	                case SALIR:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
	            }
	        } while (opcion != OpcionMenu.SALIR);

	        scanner.close();
	    }

	    public static void mostrarMenuPrincipal() {
	        System.out.println("Menú Principal");
	        System.out.println("1. Ingresar al Sistema");
	        System.out.println("2. Registrarse");
	        System.out.println("3. Salir");
	    }

	    public static OpcionMenu obtenerOpcion(Scanner scanner) {
	        System.out.print("Seleccione una opción: ");
	        int opcion = scanner.nextInt();
	        scanner.nextLine(); // Consumir el salto de línea

	        switch (opcion) {
	            case 1:
	                return OpcionMenu.INGRESAR_AL_SISTEMA;
	            case 2:
	                return OpcionMenu.REGISTRARSE;
	            case 3:
	                return OpcionMenu.SALIR;
	            default:
	                return null;
	        }
	    }

	    // Define los métodos para cada opción del menú
	    public static void ingresarAlSistema(Scanner scanner) {
	        // Implementa la lógica para ingresar al sistema
	    }

	    public static void registrarse() {
	        // Implementa la lógica para registrarse
	    }
	}

