/** InputChecker */

public class E5_1{

    private static final String domanda = "Vuoi continuare?";
    private static final String ok = "Ok";
    private static final String fine = "Fine";
    private static final String inputNV = "Dato non valido";

    public static void chiediInput(){
        System.out.println(domanda);
    }

    public static void rispondere(String risposta){
        if(risposta.equalsIgnoreCase("S") || risposta.equalsIgnoreCase("Si'") || risposta.equalsIgnoreCase("Certo") || risposta.equalsIgnoreCase("Perche' no?") || risposta.equalsIgnoreCase("s") || risposta.equalsIgnoreCase("si'") || risposta.equalsIgnoreCase("Certo") || risposta.equalsIgnoreCase("Perche' no?"))
            System.out.println(ok);  
        else if(risposta.equalsIgnoreCase("N") || risposta.equalsIgnoreCase("No") || risposta.equalsIgnoreCase("n") || risposta.equalsIgnoreCase("no"))
            System.out.println(fine);
        else
            System.out.println(inputNV);
    }
}

    
