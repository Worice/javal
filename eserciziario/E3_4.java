/** DistributoreBenzina */

public class E3_4{

        double deposito;
        double euroLitro;

        /** No gas e prezzo euro/litro
         * @prezzoLitro euro al litro */
        public E3_4(double prezzoLitro){
                deposito = 0;
                euroLitro = prezzoLitro;
        }
        
        /** Rifornimento distributore
         * @nuovaBenzina litri di benzina aggiunta al distributore */
        public void rifornisci(double nuovaBenzina){
                deposito += nuovaBenzina;
        }

        /** Cambia prezzo carburante
         * @nuovoPrezzo aggiorna prezzo al litro */
        public void aggiorna(double nuovoPrezzo){
                euroLitro = nuovoPrezzo;
        }

        /** Verifica disponibilita carburante*/
        public double residuo(){
                System.out.printf("Carburante dal doro: %.2f\n", deposito);
                return deposito;
        }
        
        /** Vendi carburante
         * @euro quanti euro di carburante viene acquistato
         * @auto da rifornire */
        public void vendi(double euro, E3_3 auto){
                double rifornimentoAuto = euro / euroLitro;
                deposito -= rifornimentoAuto;
                if(deposito > 0){
                        deposito -= rifornimentoAuto;
                        auto.addGas(rifornimentoAuto);
                        System.out.printf("%s: rifornimento %.2f euro\n", auto, rifornimentoAuto);
                }
                else{
                        deposito = 0;
                        System.out.println("Benzinaio senza carburante");
                }
        }
}

