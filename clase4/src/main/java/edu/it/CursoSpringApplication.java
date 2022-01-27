package edu.it;

import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CursoSpringApplication {
	public static void main(String[] args) throws Exception {
		Jugador j1 = new JugadorMaquina();
		Jugador j2 = new JugadorMaquina();
		
		var res = PiedraPapelTijera.analizarJugadas(
				j1,
				j2);
		
		// Como pruebo que el resultado sea el correcto
		// Voy a tomar como caso de uso un empate
		System.out.println("Resultado: " + res);
		
	}
}
