package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CursoSpringApplication {
	public static void main(String[] args) {
		float Octubre = 2.7f;
		float Noviembre  = 2.9f;
		float Diciembre  = 3.5f;
		float trimestral = Octubre + Noviembre + Diciembre;

		System.out.println(trimestral);
	}
}
