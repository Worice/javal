/** PowerGenerator */

import java.lang.Math;

public class E4_1{

    private double base;
    private int exp;

    public E4_1(){
        base = 0.0;
        exp = 0;
    }

    /** Base della potenza.
     * @inpBase imposta base della potenza
     */
    public void setBase(double inpBase){
        base = inpBase;
    }

    /** Esponente della potenza.
     * @inpExp imposta esponente della potenza
     */
    public void setExp(int inpExp){
        exp = inpExp;
    }

    public double nextPow(){
        double result = Math.pow(base, exp);
        exp += 1;
        return result;
    }
}

