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
		var botella = new Botella(750);
		botella.servir();
		botella.servir();
		botella.servir();
	}
}
