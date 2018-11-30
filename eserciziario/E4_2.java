/** TimeConverter */

import java.util.Scanner;

public class E4_2{

    private static final int GIORNOSEC = 86400;
    private static final int ORESEC = 3600;
    private static final int MINSEC = 60;
        
    private int giorni;
    private int ore;
    private int minuti;
    private int secondi;

    public E4_2(int inGiorni, int inOre, int inMinuti, int inSecondi){
        giorni = inGiorni;
        ore = inOre;
        minuti = inMinuti;
        secondi = inSecondi;
    }

    public int timeConverter(){
        int seconds = GIORNOSEC * giorni + ORESEC * ore + MINSEC * minuti + secondi;
        System.out.println(seconds);
        return seconds;
    }
}

