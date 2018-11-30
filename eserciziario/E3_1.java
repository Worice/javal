/** BankAccount */

public class E3_1{

        double saves;

        public E3_1(){
                saves = 0;
        }

        public E3_1(int n){
                saves = n;
        }

        public void prelievo(double n){
                saves -= n;
        }

        public void deposito(double n){
                saves += n;
        }

        public double getDeposito(){
                return saves;
        }

        public void interesse(double n){
                saves = saves + (saves / 100.0) * n;
        }

        public void stampaSaldo(){
                System.out.printf("Saldo: %.2f\n", saves);
        }
}
