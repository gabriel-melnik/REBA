package edu.it;

public class EjemploBasicoPolimorfismo {
	public void realizarTrayecto(ObjetoVolador objetoVolador) {
		System.out.println("Voy a despegar");
		objetoVolador.despegar();
		System.out.println("Voy a viajar");
		objetoVolador.viajar();
		System.out.println("Voy a aterrizar");
		objetoVolador.aterrizar();
		
		/*
		 * var ejemploBasicoPolimorfismo = 
				new EjemploBasicoPolimorfismo();
		 * 
		 * for (String s : args) {
			System.out.println(s);
		}
		
		String nombreClase = args[0];

		ObjetoVolador objVol = 
				(ObjetoVolador)Class.forName(nombreClase).getConstructor().newInstance();
		
		ejemploBasicoPolimorfismo.realizarTrayecto(objVol);
		 */
	}
}
