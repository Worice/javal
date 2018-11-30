/* Array tiri di dado */

public class E2_2b{

    int faces;
    int[] results;


    public E2_2b(){
        faces = 0;
    }

    public void initArray(int size){
            faces = size;
            results = new int[size + 1];
    }

    public void printArray(){
            for(int i = 1; i <= faces; ++i){
                    System.out.printf("| %d |", results[i]);
                    System.out.print('\n');
            }
    }

    public void countResults(int toss){
            results[toss] += 1;
    }

    public void plotResults(){
            for(int i = 1; i <= faces; ++i){
                    System.out.printf("| %d -> ", i);
                    for(int j = 0; j <= results[i]; ++j){
                        if(j % 10 == 0){
                                System.out.print('*');
                        }
                    }
                    System.out.print('\n');
            }
   }
}



        

