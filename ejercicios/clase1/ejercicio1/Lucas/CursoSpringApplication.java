package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CursoSpringApplication {
	public static void main(String[] args) {
        float[] arrInflacion = new float[3];		
        float promedio=0;
		arrInflacion[0] = (float)2.7;
		arrInflacion[1] = (float)2.9;
		arrInflacion[2] = (float)3.5;
		for (int x = 0; x < arrInflacion.length; x++) {
			promedio=arrInflacion[x]+promedio;
		}
		promedio=promedio/3;
		System.out.println(promedio);
		}		
	}

