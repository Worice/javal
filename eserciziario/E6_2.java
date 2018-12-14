/** PrimeGenerator */

public class E6_2{

    private int num;

    public E6_2(int input){
        num = input;
    }

    public void primeFinder(){

        int prime = 1;

        while(num > 2){
            for(int i = 2; i < num && prime == 1; i++){

                if(num % i == 0)
                    prime = 0;
            }   
            if(prime == 1)
                System.out.println(num);
            else
                prime = 1;

            num -= 1;
        }
    }
}


