package edu.it;

public class PiedraPapelTijera {
	public static Integer analizarJugadas(Jugador jugador1, Jugador jugador2) {
		var jugadaDel1 = jugador1.jugar();
		var jugadaDel2 = jugador2.jugar();
		
		// Stubs o Mocks
		if (jugadaDel1 == jugadaDel2) {
			return 0;
		} else if ((jugadaDel1 == Elementos.PIEDRA && jugadaDel2 == Elementos.PAPEL) || 
				(jugadaDel1 == Elementos.PAPEL && jugadaDel2 == Elementos.TIJERA) || 
				(jugadaDel1 == Elementos.TIJERA && jugadaDel2 == Elementos.PIEDRA)) {
			return 2;
		} else {
			return 1;
		}
	}
}
