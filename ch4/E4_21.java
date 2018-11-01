public class E4_21{
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;
	
	public double purchase;
       	public double payment;

	/*Registratore di cassa*/
	public E4_21(){
		purchase = 0;
		payment = 0;
	}
	
	/*Registra vendita di un articolo*/
	public void recordPurchase(double amount){
		purchase += amount;
	}
	
	public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies){
	payment = dollars * QUARTER_VALUE + quarters * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
	}

	public double giveChange(){
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
	
	public void enterDollars(int n){
		payment += QUARTER_VALUE * 4 * n;
	}

	public void enterQuarters(int n){
		payment += QUARTER_VALUE * n;
	}

	public void enterDimes(int n){
		payment += DIME_VALUE * n;
	}

	public void enterNickel(int n){
		payment += NICKEL_VALUE * n;
	}
	
	public void enterPennies(int n){
		payment += PENNY_VALUE * n;
	}


}	
