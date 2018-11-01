/* Circuit */

public class e3_3Circuit{
	private int switch1 = 1;
	private int switch2 = 0;
	private int lamp = 0;

	public int getSwitch1State(){
		return switch1;
	}
	
	public int getSwitch2State(){
		return switch2;
	}

	
	public int getLampState(){
		return lamp;
	}

	public void clickSwitch1(){
		if(switch1 == 1)
			switch1 = 0;
		else if (switch1 == 0)
			switch1 = 1;
	}
	
	public void clickSwitch2(){
		if(switch2 == 1)
			switch2 = 0;
		else if (switch2 == 0)
			switch2 = 1;
	}
	
	public void clickLamp(){
		if(lamp == 1)
			lamp = 0;
		else if (lamp == 0)
			lamp = 1;
	}

	public int getSwitchState(int n){
		return n;
	}

}
