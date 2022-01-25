package edu.it;

public class Botella {
	private Integer estado;
	
	public Botella(Integer ml) {
		estado = ml;
	}
	public void servir() {
		estado -= 250;
		mostrarCuantoQueda();
	}
	public void mostrarCuantoQueda() {
		System.out.println("Quedan en la botella " + estado);
	}
}
