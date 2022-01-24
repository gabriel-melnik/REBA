package edu.it;

public class ManejoArrays {
	public void correr() {
		int[] arrEnteros = new int[3];
		
		arrEnteros[0] = 3;
		arrEnteros[1] = 5;
		arrEnteros[2] = 7;
		
		for (int x = 0; x < arrEnteros.length; x++) {
			if (x == 1) {
				continue;
			}
			System.out.println(arrEnteros[x]);
		}
	}
}
