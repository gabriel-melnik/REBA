package edu.it;

public class ClaseConConstructor {
	private String nombre;
	
	/*
	 * El constructor toma del exterior un valor y lo va a mapear
	 * a un identificador que este en el scope de la clase
	 * Tiene el mismo nombre que la clase
	 * NO tiene tipo de dato de retorno
	 * Puede ser publico o privado
	 */
	
	/*
	 * 	var z1 = new MiembrosDeClaseEInstancia();
		var z2 = new MiembrosDeClaseEInstancia();
		
		z1.perteneceAlObjeto = 100;
		z2.perteneceAlObjeto = 200;
		
		z1.perteneceAlaClase = 1000;
		z2.perteneceAlaClase = 2000;
		
		System.out.println(z1.perteneceAlObjeto);
		System.out.println(z2.perteneceAlObjeto);
		
		System.out.println(z1.perteneceAlaClase);
		System.out.println(z2.perteneceAlaClase);
	 */
	
	public ClaseConConstructor(String nombre) { // inner most
		this.nombre = nombre;
	}
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	public Integer contarCantLetrasNombre() {
		return nombre.length();
	}

}
