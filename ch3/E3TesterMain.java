/* Classe tester per gli esercizi del capitolo 3 */

public class E3TesterMain{
	public static void main(String[] args){
				
		E3_9CashRegister cashReg = new E3_9CashRegister();
		cashReg.printReceipt("Palla", 5);
		cashReg.giveChange("Palla\n", 50, 24);
		cashReg.printReceipt("Pollo", 4);
		cashReg.printReceipt("Pelle", 3);

	}
}
