package edu.it;

public class Sobrecarga {
	public Sobrecarga() {
		
	}
	public Sobrecarga(Integer x) {
		
	}
	public Sobrecarga(String s) {
		
	}
	public Sobrecarga(Sobrecarga s) {
		
	}
	public Integer suma(String x, String y) {
		return Integer.valueOf(x) + Integer.valueOf(y);
	}
	public Integer suma(Integer x, Integer y, Integer z) {
		return x + y + z;
	}
	public void run() {
		suma("2","3");
		System.out.println("");
		System.out.println(55);
	}
}
