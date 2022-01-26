package edu.it;

public class TirarPiedraAlArbitro implements ObjetoVolador {

    public void despegar() {
        System.out.println("Agarrar una piedra");
        System.out.println("Estirar el brazo");
        System.out.println("Lanzar la piedra");
    }

    public void viajar() {
        System.out.println("La priedra sigue la trayectoria");
    }

    public void aterrizar() {
        System.out.println("Golpea al arbitro");
    }
}
