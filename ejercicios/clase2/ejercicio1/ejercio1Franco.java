package edu.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ejercio1Franco {
	public static void main(String[] args) {
		
		//declaro el array como un objeto
		
		Botella arrBotellas[] =  new Botella[5]; 
		
		//le doy valor a los indices del array que serian las botellas
		
		arrBotellas[0] = new Botella(250); 
		arrBotellas[1] = new Botella(1000);
		arrBotellas[2] = new Botella(750);
		arrBotellas[3] = new Botella(2500);
		arrBotellas[4] = new Botella(3000);
		
		//indico de que botella sirvo los 250ml
		
		arrBotellas[4].servir();
		arrBotellas[4].servir();
		arrBotellas[2].servir();
		arrBotellas[3].servir();
		
		// imprimo cuanto le queda a cada botella
				
		for (Botella botella : arrBotellas) {
			
			botella.mostrarCuantoQueda();

			
		}

	}
}
