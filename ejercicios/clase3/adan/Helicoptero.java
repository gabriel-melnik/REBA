package edu.it;

public class Helicoptero  implements ObjetoVolador{
    public void despegar() {
        System.out.println("Acelerar");
        System.out.println("Helices girando");
        System.out.println("Empezando a elevar");
    }

    public void viajar() {
        System.out.println("Manejar helicoptero");
    }

    public void aterrizar() {
        System.out.println("Empezando a bajar");
        System.out.println("Desacelerar");
        System.out.println("Se paran las helices");
    }
}
