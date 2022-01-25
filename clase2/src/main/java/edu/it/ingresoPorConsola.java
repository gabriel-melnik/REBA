package edu.it;

import java.util.Random;
import java.util.Scanner;

public class ingresoPorConsola {
	public void test() {
		System.out.println("Ingrese 1 piedra, 2 papel, 3 tijera");
		Scanner scn = new Scanner(System.in);
		Integer ppp = scn.nextInt();
		
		System.out.println("Juega el computador");
		int z = new Random().nextInt(3);
		System.out.println(z);
		
		// Funcion pura, que evalue el ganador
		/***
		 * Mapear el 0 ConstantesPPT.PIEDRA
		 * Mapear el 1 ConstantesPPT.PAPEL
		 * Mapear el 2 ConstantesPPT.TIJERA
		 */
		
		/*
		 * La funcion pura va a tener 9 casos de uso
		 * jugar(PIEDRA, PIEDRA) -> 0
		 * jugar(PIEDRA, PAPEL) -> 2
		 * jugar(PIEDRA, TIJERA) ->  1
		 */
	}
}
