package edu.it;

class Persona {
	public String nombre;
	public String apellido;
	public Boolean confiable;
}

class Cliente {
	public Persona persona;
	public Double montoCrediticio;
}

class Contratista {
	public Persona persona;
	public Double presupuesto;
}

class EvaluadorDeCredito {
	public Boolean califica(Cliente c) { return true; };
	public Boolean califica(Contratista c) { return false; }
}

class Auto {
	public final String marca;
	public final Boolean estado;
	
	public Auto(String marca, Boolean estado) {
		super();
		this.marca = marca;
		this.estado = estado;
	}	
}

class ManipuladorAutomovil {
	public Auto arrancar(Auto a) {
		Auto autoRet = new Auto(a.marca, true);
		return autoRet;
	}
}

public class HerenciaDeTipos {
	public void ejecutar() {
		Persona p = new Persona();
		
		
	}
}
