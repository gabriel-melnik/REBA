package edu.it;

import java.util.Random;

public class JugadorMaquina implements Jugador {
	public Elementos jugar() {
		int z = new Random().nextInt(3);
		Elementos elem = Utiles.traducirIntToElem(z);
		System.out.println("La maquina selecciono: " + elem.name());
		return elem;
	}
}
