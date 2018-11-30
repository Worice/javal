public class CH1_7Tester{
    public static void main(String args[]){

        if(args.length== 0){
            System.out.println("No Input");
            return;
        }

        for(int i = 0; i < args.length; ++i){
                char[] word = args[i].toCharArray();
               }

        for(char c: word)
            System.out.print(c);



    }

    //Morse alphabet
    static final String[] morse = {
        ".-", //a
        "-...", //b
        "-.-." //c
    };     




}
