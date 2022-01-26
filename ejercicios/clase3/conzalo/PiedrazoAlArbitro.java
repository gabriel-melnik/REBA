package edu.it;

public class PiedrazoAlArbitro implements ObjetoVolador{
	public void despegar() {
		System.out.println("agarro piedra del piso");
		System.out.println("preparo el curpo para lanzar");
		System.out.println("lanzo la piedra");
	}
	public void viajar() {
		System.out.println("velocidad constante a la frente");
	}
	public void aterrizar() {
		System.out.println("desacelera por friccion del aire");
		System.out.println("golpea la cara del árbitro");
		System.out.println("desciende por gravedad al piso");
		System.out.println("choca con la superficie terrestre");
	}
}
