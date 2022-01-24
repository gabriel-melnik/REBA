package edu.it;

public class Ejercicio2Adan {
    public Integer comprobarZ(int z){
        if (z % 2 == 0){
            return z / 2;
        }
        else {
            return (z * 3) + 1;
        }
    }
    public void run(){
        int z = 3;
        while (z != 1){
            z = comprobarZ(z);
            System.out.println(z);
        }
    }
}
