package edu.it;

import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

class StubPiedra implements Jugador {

	@Override
	public Elementos jugar() {
		return Elementos.PIEDRA;
	}
}

class StubTijera implements Jugador {

	@Override
	public Elementos jugar() {
		return Elementos.TIJERA;
	}
}

@SpringBootApplication
@EnableAspectJAutoProxy
public class CursoSpringApplication {
	public static void main(String[] args) throws Exception {
		Jugador j1 = new JugadorMaquina();
		Jugador j2 = new JugadorConsola();
		
		// var jugadaDelJugador1 = j1.jugar();
		// var jugadaDelJugador2 = j2.jugar();
		
		var res = PiedraPapelTijera.analizarJugadas(new StubPiedra(), new StubTijera());
		
		// Como pruebo que el resultado sea el correcto
		// Voy a tomar como caso de uso un empate
		System.out.println("Resultado: " + res);
		
	}
}
