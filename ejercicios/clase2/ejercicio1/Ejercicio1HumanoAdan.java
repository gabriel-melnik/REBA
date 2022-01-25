package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CursoSpringApplication {
	public static void main(String[] args) {
		/* 
		 * Armar un array con 5 botellas
		 * Ir sirviendo con botellas aletoreas
		 * luego hacer un for (:) {}
		 * mostrando el estado de las botellas
		 */
		Botella arrBotella[] = new Botella[5];

		arrBotella[0] = new Botella(1000);
		arrBotella[1] = new Botella(750);
		arrBotella[2] = new Botella(500);
		arrBotella[3] = new Botella(400);
		arrBotella[4] = new Botella(250);

		arrBotella[0].servir();
		arrBotella[3].servir();
		arrBotella[2].servir();
		arrBotella[2].servir();
		arrBotella[4].servir();

		System.out.println("---------------¿Cuanto queda en las botellas?---------------");
		for(Botella botella : arrBotella){
			botella.mostrarCuantoQueda();
		}
		/*var botella = new Botella(750);
		botella.servir();
		botella.servir();
		botella.servir();*/
	}
}
