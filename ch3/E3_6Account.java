/* Classe esercizio 3.6 */

public class E3_6Account{

	private float balance = 0;

	public float getBalance(){
		return balance;
	}

	public void withdraw(int n){
		for(int i = 0; i < n; ++i)
			balance -= 1.0;
	}	

	public void deposit(int n){
		for(int i = 0; i < n; ++i)
			balance += 1.0;
	}

	public void interest(int n){
		balance += (balance / 100.0) * n;
	}
}
