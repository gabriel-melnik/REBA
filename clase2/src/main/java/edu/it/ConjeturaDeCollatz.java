package edu.it;

public class ConjeturaDeCollatz {
	private Boolean estaEnElLoop(Integer z) {
		if ((z == 4) || (z == 2)) {
			return true;
		}
		return false;
	}
	private Boolean esPar(Integer z) {
		if (z % 2 == 0) {
			return true;
		}
		return false;
	}
	private Integer fold(Integer z) {
		return z / 2;
	}
	private Integer tresNMasUno(Integer z) {
		return (3 * z) + 1;
	}
	public void test(Integer z) {
		Boolean primeraVezEnElLoop = true;
		
		while (estaEnElLoop(z) == false) {
			System.out.println(z);
			if (esPar(z)) {
				z = fold(z);
			} else {
				z = tresNMasUno(z);
			}
		}
		if (z > 2) System.out.println(4);
		if (z > 1) System.out.println(2);
		System.out.println(1);
	} 
}
