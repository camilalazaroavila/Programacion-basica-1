package testarrays;

public class testarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new teclado(System.in);
				int vectorDeNumerosEnteros []= new int [10];
				int i =0;
				final int TAMANIO =10;
				double promedio=0.0;
//				int suma=0;
//				int mayor =0;
//				int menor=0;
		//	
				
				//limpieza del vector
				for (i=0; i<TAMANIO; i++){
				vectorDeNumerosEnteros [i]= 0;
				}
				//Carga del vector
			
				for (i=0; i<vectorDeNumerosEnteros.length; i++) {
				System.out.println("en la posicion "+(i+1) +" Contiene "+ vectorDeNumerosEnteros [i]); 	
				}
				}
		
		
		
		
	}


