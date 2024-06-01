package ar.edu.unlam.pb1.interfazz;

public class Clima {
 private final double GRADOS_PARA_SENTIR_FRIO= 20;
 private final double HUMEDAD_PARA_SENTIR_FRIO= 70;
 
 private double grados;
 private double humedad;
 
 public Clima(double grados, double humedad) {
	 this.grados =grados;
 }
 public Clima(int i) {
	// TODO Auto-generated constructor stub
}
public boolean haceFrio() {
	 //-de 20° y humedad <70 se considera frio
	 if (this.grados<GRADOS_PARA_SENTIR_FRIO && this.humedad<HUMEDAD_PARA_SENTIR_FRIO) {
 }else {
	 //haceFrio=false
return false;	 
 }
	// return haceFrio;
	return false;
	 

}
}

