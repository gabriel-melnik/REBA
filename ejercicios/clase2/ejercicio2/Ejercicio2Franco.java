package edu.it;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio2Franco {
	//se compara para ver quien gana
	public Integer Jugar (int jugador1, int jugador2) {
		if (jugador1 == jugador2) {
			return 0;
		} else if (((jugador1 == ConstantesPPT.TIJERA) && (jugador2 == ConstantesPPT.PAPEL)) || ((jugador1 == ConstantesPPT.PAPEL) && (jugador2==ConstantesPPT.PIEDRA)) || ((jugador1 == ConstantesPPT.PIEDRA) && (jugador2==ConstantesPPT.TIJERA))) {
			return 1;
		} else { 
			return 2;
		}
	}
	
	
	public void PiedraPapeloTijera() {
		System.out.println("Ingrese 1 piedra, 2 papel, 3 tijera");
		Scanner scn = new Scanner(System.in);                //el usuario ingresa si desea elejir papel, piedra o tijera
		Integer player = scn.nextInt();
		
		System.out.println("Juega el computador");
		int computer = new Random().nextInt(3); //la computadora arroja un número random 
		System.out.println(computer);
	
		
	//se llama a la función y se imprime quien gano si el usuario o la computadora 
		
	switch(Jugar(player, computer)) {
		case 0:
			System.out.println("Empate");
			break;
		case 1: 
			System.out.println("Gana usuario");
			break;
		case 2:
			System.out.println("Gana computadora");
			break;
		default:
			System.out.println("***HAY UN BUG***");
			break;
	}
}
	
		
		
		
		
		
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