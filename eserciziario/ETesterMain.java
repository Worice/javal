/* Tester class eserciziario */

import java.util.Scanner;

public class ETesterMain{
    public static void main(String args[]){

            Scanner in = new Scanner(System.in);
            int pass = in.nextInt();

            E6_2 primes = new E6_2(pass);
            primes.primeFinder();
    }
}   

