package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ejercicio1Lucas {
	public static void main(String[] args) {
		
		//Objeto de array Botella
		Botella arrBotella[] = new Botella[5];
		arrBotella[0] = new Botella (1500);
		arrBotella[1] = new Botella (1250);
		arrBotella[2] = new Botella (1000);
		arrBotella[3] = new Botella (750);
		arrBotella[4] = new Botella (500);
		
		//llamo a servir
		
		arrBotella[1].servir();
		arrBotella[1].servir();
		arrBotella[2].servir();
		arrBotella[2].servir();
		arrBotella[3].servir();
		
		//Imprimo valor de botella
		
		for(Botella botella : arrBotella) {
			botella.mostrarCuantoQueda();
		}
	}
	
}
