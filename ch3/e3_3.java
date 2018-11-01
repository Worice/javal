/* Esercizio 3.3, circuito elettrico */

public class e3_3{
	public static void main(String[] args){
	
	e3_3Circuit myCir = new e3_3Circuit();

	e3_3Tester myTst = new e3_3Tester();

	myTst.test(myCir);

	System.out.printf("State: %d\n", myCir.getSwitchState(myCir.getSwitch1State()));

	}
}	
