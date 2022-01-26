package edu.it;

class Persona {
	public String nombre;
	private Integer edad;
	public String apellido;
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		if (edad > 50) {
			throw new RuntimeException("Tiro un error");
		}
		this.edad = edad;
	}
}

interface IValidadorPersona { void validar(Persona p) }
class ValidadorHipteca implements IValidadorPersona {
	public void validar(Persona p) {
		
	}
}
class ValidadorProdLimpieza implements IValidadorPersona {
	public void validar(Persona p) {
		
	}
}



public class PublicoPrivdor {
	public void mostrarEjemplo() {
		Persona p = new Persona();
		p.setEdad(70);
	}
}
