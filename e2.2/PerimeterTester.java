/* Esercizio 2.2 */

import java.awt.Rectangle;

public class PerimeterTester{
	public static void main(String[] args){
		Rectangle box = new Rectangle(10, 10, 19, 10);
		System.out.print("Perimetro rettangolo: ");
	       	System.out.println(2 * (box.getWidth() + box.getHeight())); 
	}
}


