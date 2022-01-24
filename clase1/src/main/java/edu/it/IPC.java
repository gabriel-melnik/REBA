package edu.it;

public class IPC {
	public float actualizar(float base, float indice) {
		return base += (base * indice);
	}
	public void calcular() {
		float[] arrIndices = new float [] {0.027f, 0.029f, 0.035f};
		
		float base = 100f;
		
		for (int x=0; x < arrIndices.length; x++) {
			System.out.println(base);
			base = actualizar(base, arrIndices[x]);
		}
		
		base = 100f;
		
		for (float indice : arrIndices) {
			System.out.println(base);
			base = actualizar(base, indice);
		}
		
		System.out.println(
				String.join(" ", String.valueOf(base - 100), "%")
		);
	}
}
