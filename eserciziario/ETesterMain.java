/* Tester class eserciziario */

import java.util.Scanner;

public class ETesterMain{
    public static void main(String args[]){

            Scanner in = new Scanner(System.in);

            int d = in.nextInt();
            int m = in.nextInt();
            int r = in.nextInt();
            int s = in.nextInt();
            
            E4_2 time = new E4_2(d, m, r, s);
            time.timeConverter();
    }
}   

