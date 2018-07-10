/* Exercise 2.4 */

import java.awt.Rectangle;

public class e2e4{
	public static void main(String[] args){
		Rectangle box1 = new Rectangle(15, 15, 8, 6);
		System.out.println(box1.getHeight() * box1.getWidth());
		Rectangle box2 = new Rectangle(15, 15, 11, 10);
		System.out.println(2 * (box2.getHeight() + box2.getWidth()));
	}
}	
