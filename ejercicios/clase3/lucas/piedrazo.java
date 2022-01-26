package edu.it;

public class PiedrazoAlArbitro implements ObjetoVolador {

	@Override
	public void despegar() {
		System.out.println("Se toma piedra del suelo ");
		System.out.println("El hincha toma carrera ");
		System.out.println("Inclina el brazo hacia atras para tomar impulso ");
	}

	@Override
	public void viajar() {
		System.out.println("Sale de la mano del hincha");
		System.out.println("Toma dirección hacia la cabeza del arbitro");
		System.out.println("Desciende por el aire con impulso");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("Se acerca a la cabeza del arbitro");
		System.out.println("Impacta en el arbitro");
		
	}

}
