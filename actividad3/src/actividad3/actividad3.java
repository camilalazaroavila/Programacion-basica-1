package actividad3;

public class actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pre post incremento
		byte numeroByte =127;
		System.out.println("Numero byte:" + numeroByte);
		
		short numeroShort = 130;
		numeroByte = (byte) numeroShort;
		System.out.println("Numero byte:" + numeroByte);
		 
		int numeroInt = 2147483647;
		System.out.println("Numero int:"+ numeroInt);
		
		numeroInt = numeroInt + 1;
		System.out.println("Numero Int:"+numeroInt);
	}

}
