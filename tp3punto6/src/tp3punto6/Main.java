package tp3punto6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuentaCami= new Cuenta();
		//modificamos lasc condiciones inicales del saldo
		
		cuentaCami.setSaldo(500);
		
		System.out.println("Saldo disponible: $"+cuentaCami.getSaldo());
		System.out.println(cuentaCami.extraerDinero(800));
	}

}
