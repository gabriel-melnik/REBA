package edu.it;

public class Avion implements ObjetoVolador {
	public void despegar() {
		System.out.println("acelero");
		System.out.println("despliega los flaps");
		System.out.println("guarda las ruedas");
	}
	public void viajar() {
		System.out.println("velocidad constantes millas / hora");
	}
	public void aterrizar() {
		System.out.println("saco las ruedas");
		System.out.println("despluego otros flaps");
		System.out.println("trato de no pifiarle a la pista");
		System.out.println("toco primero con las de atraz");
		System.out.println("luego las de adelante");
		System.out.println("turbina inversa");
	}
}
