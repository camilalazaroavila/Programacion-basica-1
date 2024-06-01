package ar.edu.unlam.pb1.interfazz;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Clima clima= new Clima(1,20); 

boolean haceFrio= clima.haceFrio();

///if(clima.haceFrio()) //uso el dato sin asignar una variable local
if(haceFrio ==true) {
	//caso verdadero en la evaluacon del if
System.out.println("Hace frio: Si");
}else {
//caso falso, no se cumplio la condicion del if
	System.out.println("Hace frio: NO");
	}

}}
