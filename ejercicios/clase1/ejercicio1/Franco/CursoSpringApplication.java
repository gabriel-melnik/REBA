package edu.it;

public class CursoSpringApplication{
	public static void main(String[] args) {
		float[] arrMeses = new float [3];
		float trimestral = 0;
		float trimestralfinal= 0;
		
		
		arrMeses[0] = 2.7f;
		arrMeses[1] = 2.9f;
		arrMeses[2] = 3.5f;
		
		for (int i = 0; i < arrMeses.length; i++) {
			trimestral+=arrMeses[i];
			
		}
		trimestralfinal = trimestral /3;
		System.out.println("la inflacion trimestral es = "+trimestralfinal);
	} 
}