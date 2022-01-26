package edu.it;

public class PegarAlArbitro implements ObjetoVolador {

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("La persona busca la piedra");
		System.out.println("La persona agarra la piedra");
		System.out.println("La persona toma impulso para lanzar la piedra");
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		System.out.println("La persona lanza la piedra");
		System.out.println("La piedra vuela por el aire");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("La piedra empieza a caer");
		System.out.println("La piedra impacta al arbitro");
	}

}
