/* Dado */

import java.util.Random;
import java.lang.Math;


public class E2_2{
    
    private int numeroFacce;
    private Random gen;

    public E2_2(){
            numeroFacce = 6;
            gen = new Random();
    }

    public E2_2(int facce){
            numeroFacce = facce;
            gen = new Random();
    }

    public int getFaces(){
            return numeroFacce;
    }

    public void changeFaces(int facce){
            numeroFacce = facce;
    } 

    public int tossDice1(){
            int result = gen.nextInt(numeroFacce) + 1;
            return result;
    }

}
