/** 6.1 Fact */

public class E6_1{
    
    private int fact;
    private int n;

    public E6_1(int i){
        fact = i;
        n = i;
    }

    public void factorize(){
        while(fact > 1){
            fact -= 1;
            n *= fact;
        }
    }

    public int getFact(){
        return n;
    }

}


