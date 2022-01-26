package edu.it;

import java.util.Random;
import java.util.Scanner;

public class IngresoPorConsola {
	public void test() {
		System.out.println("Ingrese 1:piedra, 2:papel, 3:tijera");
		Scanner scn = new Scanner (System.in);
		Integer ppp = scn.nextInt();
		
		System.out.println("juega la computadora");
		int z = new Random().nextInt(3);
		System.out.println(z);

                var resultado = piedraPapelTijera(ppp, z);
		mostrarGanador(resultado);
	}
	public void mostrarGanador(Integer piedraPapelTijera) {
               switch(piedraPapelTijera) {
		case 0:
			System.out.println("empate");
			break;
		case 1:
			sout(System.out.println("gana el usuario"));
			break;
		case 2:
			sout(System.out.println("gana la pc"));
			break;
		default:
			System.out.println("hay un bug");
	        }
        }
	public Integer piedraPapelTijera(Integer j1, Integer j2) {
		Integer piedra = ConstantePPT.PIEDRA;
		Integer papel = ConstantePPT.PAPEL;
		Integer tijera = ConstantePPT.TIJERA;
		if (j1 == j2){
			return 0;
		} else if ((j1 == piedra && j2 == papel) || (j1 == papel && j2 == tijera) || (j1 == tijera && j2 == piedra)) {
			return 2;
		} else {
			return 1;
		}
                // Nunca llega a ejecutarse.
	}
}
