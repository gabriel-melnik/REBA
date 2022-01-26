package edu.it;

public class Helipcotero implements ObjetoVolador {

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("acelero");
		System.out.println("Se mueven la elipses");
		System.out.println("Se empieza a elevar");
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		System.out.println("velocidad constantes millas / hora");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("desacelera");
		System.out.println("empieza a descender");
		System.out.println("aterriza");
	}

}
