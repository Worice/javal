/** Dipendente */

public class E3_5{
    
    private String nome;
    double stipendio;

    public E3_5(String inpNome, double inpStipendio){
        nome = inpNome;
        stipendio = inpStipendio;
    }

    /** Restituisce nome dipendente. */
    public void getNome(){
        System.out.println(nome);
    }

    /** Restituisce stipendio dipendente. */
    public double getStipendio(){
        return stipendio;
    }

    /** Cambia stipendio. 
     * @newStipendio nuovo stipendio.
     */ 
    public void setStipendio(double newStipendio){
        stipendio = newStipendio;
    }

    /** Cambia nome. 
     * @newNome nuovo nome.
     */
    public void setNome(String newNome){
        nome = newNome;
    }

    /** Aumento!
     * @percent percentuale aumento.
     */
    public void aumento(double percent){
        stipendio += (stipendio / 100) * percent;
    }
}






