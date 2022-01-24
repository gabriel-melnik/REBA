package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Ejercicio2Lucas {
	public static void main(String[] args) {
		int z = 5;
		//Linea para que Z tome un valor
		//Linea para volver a evaluar el número 
		while (z!=1) {
		if (z%2==0){
			z=z/2;
		} else {
			z=(3*z)+1;
		}
					}
		System.out.println(z);
											}
}