package edu.it;

public class Helicoptero implements ObjetoVolador {

	@Override
	public void despegar() {
		System.out.println("Enciende el motor: ");
		System.out.println("Se mueven las helices: ");
		System.out.println("Toma altura: ");
	}

	@Override
	public void viajar() {
		System.out.println("Se inclina hacia adelante: ");
		System.out.println("Se desplaza: ");
	}

	@Override
	public void aterrizar() {
		System.out.println("Baja las potencias de las helices");
		System.out.println("Aterriza con cuidado ");
	}

}
