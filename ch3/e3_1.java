/* Esercizio 3.1, 3.2 */

public class e3_1{
	public static void main(String[] args){
	e3_1Counter myCnt = new e3_1Counter();
	myCnt.setLimit(3);
	System.out.println(myCnt.getLimit());
	myCnt.click(1);
	System.out.println(myCnt.getValue());
	myCnt.undo(1);
	System.out.println(myCnt.getValue());
	myCnt.click(1);
	System.out.println(myCnt.getValue());
	myCnt.click(1);
	System.out.println(myCnt.getValue());
	myCnt.click(1);
	System.out.println(myCnt.getValue());
	myCnt.click(1);
	System.out.println(myCnt.getValue());
	myCnt.click(1);
	System.out.println(myCnt.getValue());
	myCnt.click(1);
	System.out.println(myCnt.getMax(myCnt.getValue()));
	}
}


