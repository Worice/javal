/** BankWithPassword */

public class E5_9{

        private double saves;
        private int password;

        public E5_9(double initAcc, int pass){

                saves = 0;
                password = pass;
        }

        public boolean testPassword(int pass){
            if(password == pass)

                return true;
            return false;
        }

        
        public boolean prelievo(double n, int pass){
            if(testPassword(pass) == true){    
                saves -= n;
                return true;
            }
            return false;
        }

        public boolean deposito(double n, int pass){
            if(testPassword(pass) == true){    
                saves += n;
                return true;
            }
            return false;
        }

        public double getDeposito(){
                return saves;
        }

        public boolean interesse(double n, int pass){
            if(testPassword(pass) == true){    
                saves = saves + (saves / 100.0) * n;
                return true;
            }
            return false;
        }

        public void stampaSaldo(){
                System.out.printf("Saldo: %.2f\n", saves);
        }
}
