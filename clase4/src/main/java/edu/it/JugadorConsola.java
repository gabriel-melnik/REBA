package edu.it;

import java.util.Scanner;

public class JugadorConsola implements Jugador {
	public Elementos jugar() {
		System.out.println("Ingrese 1:piedra, 2:papel, 3:tijera");
		Scanner scn = new Scanner (System.in);
		Integer ppp = scn.nextInt()-1;
		return Utiles.traducirIntToElem(ppp);
	}
}
