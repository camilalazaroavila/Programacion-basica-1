package ar.edu.unlam.pb1.interfaz;

public class ejerciciolampara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///prender y apagar varias veces 3 lampartiras y ver cuantas veces se prendieron cada una
		//
Lampara lamparaMartin=new Lampara();
Lampara lamparaBenja=new Lampara();
Lampara lamparaBeni=new Lampara();

//pongo a los changos a prender y apagar
lamparaMartin.encender();
lamparaMartin.apagar();
lamparaMartin.encender();
lamparaMartin.apagar();
lamparaMartin.encender();
lamparaMartin.apagar();
lamparaMartin.encender();
lamparaMartin.apagar();
lamparaMartin.encender();
lamparaMartin.apagar();
lamparaMartin.encender();
lamparaMartin.apagar();
lamparaMartin.encender();
lamparaMartin.apagar();
lamparaMartin.encender();
lamparaMartin.apagar();

lamparaBeni.encender();
lamparaBeni.apagar();
lamparaBeni.encender();
lamparaBeni.apagar();
lamparaBeni.encender();
lamparaBeni.apagar();
lamparaBeni.encender();
lamparaBeni.apagar();
lamparaBeni.encender();
lamparaBeni.apagar();
lamparaBeni.encender();
lamparaBeni.apagar();

lamparaBenja.encender();
lamparaBenja.apagar();
lamparaBenja.encender();
lamparaBenja.apagar();
lamparaBenja.encender();
lamparaBenja.apagar();
lamparaBenja.encender();
lamparaBenja.apagar();

//informar cuantas veces la prendieron
int cantidadDeVecesQuePrendioBenja= lamparaBenja.getCantidadDeVecesEncendida();
System.out.println("Benja prendio:"+cantidadDeVecesQuePrendioBenja);
System.out.println("Martin prendio:"+lamparaMartin.getCantidadDeVecesEncendida());
System.out.println("Beni prendio:"+lamparaBeni.getCantidadDeVecesEncendida());
	}

	
}
