/** Car */

public class E3_3{

        private double gas;
        private double lKm;

        /** La classe rappresenta un auto
         * @gas litri di carburante
         * @lKm consumo in litri/km */

        public E3_3(double litriKm){
                gas = 0;
                lKm = litriKm;
        }

        /** Carburante rimanente
         * @kms chilomtri percorsi*/

        public void drive(double kms){
                gas -= kms * lKm;
        }

        /** Controlla serbatoio */

        public double getGas(){
                return gas;
        }

        /** Rifornimento
         * @litri aggiungi carburante */

        public void addGas(double liters){
                gas += liters;
        }

}


