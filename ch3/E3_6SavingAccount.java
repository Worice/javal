/* Classe per esercizio 3.6. Esercizio 3.8 */

public class E3_6SavingAccount{

	private double balance;
	private double interest;

	public E3_6SavingAccount(double balance, double interest){
		this.balance = balance;
		this.interest = interest;
	}
	
	public void addInterest(){
		balance += (balance / 100.0) * interest;
	}

	public void printBalance(){
		System.out.printf("Balance:\t%f\nInterest:\t%f\n", balance, interest);
	}

	

}



