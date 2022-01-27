package edu.it;

public class Utiles {
	public static Elementos traducirIntToElem(Integer x) {
		switch (x) {
		case 0:
			return Elementos.PIEDRA;
		case 1:
			return Elementos.PAPEL;
		case 2:
			return Elementos.TIJERA;
		default:
			throw new RuntimeException("Esto esta realmente MAAAAAAAAAAAL");
		}
	}
}
