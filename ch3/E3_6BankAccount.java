/* Esercizi dal 3.6 */

public class E3_6BankAccount{
	public static void main(String[] args){

		E3_6Account myAcc = new E3_6Account();

		System.out.println(myAcc.getBalance());

		myAcc.deposit(1000);

		System.out.println(myAcc.getBalance());

		myAcc.withdraw(400);
		
		System.out.println(myAcc.getBalance());
	
		myAcc.interest(100);

		System.out.println(myAcc.getBalance());
	
		E3_6SavingAccount mySAcc = new E3_6SavingAccount(1000.0, 20.0);

		mySAcc.addInterest();
		mySAcc.addInterest();
		mySAcc.addInterest();
		mySAcc.addInterest();
		mySAcc.addInterest();

		mySAcc.printBalance();
	}
}
		
