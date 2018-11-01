/* Classe tester per gli esercizi del capitolo 3 */

import java.util.Scanner;

public class CH4TesterMain{
	public static void main(String[] args){
	E4_4 myObj = new E4_4();
	
	Scanner in = new Scanner(System.in);

	myObj.n = in.nextInt();
	System.out.println("Second input\n");
	myObj.m = in.nextInt();
	myObj.sum();
	myObj.dif();
	myObj.mul();
	myObj.avg();
	myObj.absV();
	myObj.minV();
	myObj.maxV();

	
	}
}
