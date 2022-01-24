package edu.it;

public class HumanoAdan {
    public void correr(){
        float[] arrFloats = new float[3];
        float totalTimestral = 0;

        arrFloats[0] = 2.7f;
        arrFloats[1] = 2.9f;
        arrFloats[2] = 3.5f;

        for(int x = 0; x < arrFloats.length; x++){
            totalTimestral = arrFloats[x] + totalTimestral;
        }
        System.out.println(totalTimestral);
    }
}
