package edu.it;

public class Helicoptero implements ObjetoVolador {
	public void despegar() {
		System.out.println("prende motor");
		System.out.println("comienza a girar las helices");
		System.out.println("comienza a elevarse");
	}
	public void viajar() {
		System.out.println("velocidad constantes millas / hora");
	}
	public void aterrizar() {
		System.out.println("diviso la pista");
		System.out.println("me coloco encima de la pista");
		System.out.println("desciendo moderandamente");
		System.out.println("aterrizo");
		System.out.println("dejan de girar las helices lentamente");
	}
}
