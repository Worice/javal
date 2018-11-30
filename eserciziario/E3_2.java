/** Cellulare */

public class E3_2{

        double carica;
        int numChiamate;

        public E3_2(double saldoAttivazione){
                carica = saldoAttivazione;
                numChiamate = 0;
        }

        public void ricarica(double schei){
                carica += schei;
        }

        public void chiama(int minuti){
                carica = carica - minuti * 0.20;
        }

        public double num404(){
                return carica;
        }

        public int getChiamate(){
                return numChiamate;
        }

        public void azzeraChiamate(){
                numChiamate = 0;
        }
}




