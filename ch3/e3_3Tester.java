/* Tester */

public class e3_3Tester{

	public void printSwitch(e3_3Circuit c){
		System.out.println(c.getSwitch1State());
	}
	
	public void test(e3_3Circuit c){
		for(int i = 0; i < 2; ++i){
			c.clickSwitch1();
			for(int j = 0; j < 2; ++j){
				c.clickSwitch2();
				c.clickLamp();
				System.out.printf("s1: %d, s2: %d, l: %d\n", c.getSwitch1State(), c.getSwitch2State(), c.getLampState());
			}
		}
	}	
}
