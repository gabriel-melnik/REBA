package edu.it;

public class EjemploBasicoPolimorfismo {
	public void realizarTrayecto(ObjetoVolador objetoVolador) {
		System.out.println("Voy a despegar");
		objetoVolador.despegar();
		System.out.println("Voy a viajar");
		objetoVolador.viajar();
		System.out.println("Voy a aterrizar");
		objetoVolador.aterrizar();
	}
}
