package edu.it;

class ServicioA extends Object {
	public void evaluar() {
		System.out.println("Evaluando Servicio A");
	}
}

class ServicioB extends ServicioA {
	public void evaluar() {
		System.out.println("Tengo mi propia forma de Evaluar");
	}
	public void analizar() {
		System.out.println("Analizando Servicio B");
	} 
}

public class Herencia {
	public void muestraHerencia() {
		Object punteroACualquierObjeto = null;
		ServicioA srva = null;
		srva = new ServicioA();
		punteroACualquierObjeto = srva;
		srva.evaluar();
		srva = new ServicioB();
		srva.evaluar();
		
		// Pregunta del millon como lo recupero si uno es Object y el otro
		// es ServicioA
		
		srva = (ServicioA)punteroACualquierObjeto;
		srva.evaluar();
	}
}
