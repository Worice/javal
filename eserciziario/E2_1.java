/* Rettangolo */

public class E2_1{
    private int base;
    private int altezza;
    private int ascissa;

    private int ordinata;

    public E2_1(int unaBase, int unAltezza, int unAscissa, int unOrdinata){
        base = unaBase;
        altezza = unAltezza;
        ascissa = unAscissa;
        ordinata = unOrdinata;
    }

    public int getBase(){
        return base;
    }
 
    public int getAltezza(){
        return altezza;
    }

    public int getAscissa(){
        return ascissa;
    }

    public int getOrdinata(){
        return ordinata;
    }

    public void setBase(int unaBase){
        base = unaBase;
    }
 
    public void setAltezza(int unAltezza){
        altezza = unAltezza;
    }

    public void setAscissa(int unAscissa){
        ascissa = unAscissa;
    }

    public void setOrdinata(int unOrdinata){
        ordinata = unOrdinata;
    }

    public void printRectangle(){
            for(int i = 0; i < base; ++i)
                    System.out.print('*');
    
            System.out.print('\n');
            
            for(int j= 0; j < altezza - 2; ++j){
                    System.out.print('*');
                    for(int q = 0; q < (base - 2); ++q)
                           System.out.print(' ');
                    System.out.print('*');
                    System.out.print('\n');
            }
            for(int k = 0; k < base; ++k)
                    System.out.print('*');
            
            System.out.print('\n');
    }

    public int perimeter(){
            return ((base + altezza) * 2);
    }

    public int area(){
            return (base * altezza);
    }

}


















