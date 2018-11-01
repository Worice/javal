/* Contapersone */

public class e3_1Counter{
	private int value;
	private int limit;

	public void setLimit(int max){
		limit = max;
	}

	public int getLimit(){
		return limit;
	}

	public int getMax(int n){
		return Math.min(n, limit);
	}

	public void click(int n){
		value = value + 1;
	}

	public int getValue(){
		return value;
	}

	public void reset(){
		value = 0;
	}

	public void undo(int n){
		value = value - 1;
	}
}
