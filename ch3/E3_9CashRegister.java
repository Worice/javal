/* Esercizio 3.9 */

public class E3_9CashRegister{

	private double purchase;
	private double itemPrice;
	private double payment;
	private double change = 0;
	private String receipt= "";

	public String giveChange(String item, double money, double cost){
		payment = money;
		purchase = cost;
		
		change = payment - purchase;
		purchase = 0;
		payment = 0;
		return String.valueOf(change);
	}

	public void printReceipt(String s, double paid){
		purchase = purchase + paid;
		System.out.printf("%s: %f\n", s, paid);
		receipt = receipt.concat(s);
		System.out.printf("%s\n", receipt);
		System.out.printf("Total: %f\nPaid: %f\nChange: %f\n", 1, purchase, 9);
		System.out.printf("%s", "\n");

	}
		
}


