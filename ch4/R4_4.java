public class R4_4{
	private double x;
	private double y;
	private int m;
	private int n;

	public double xOut;
	public double yOut;
	public double mOut;
	public double nOut;
	public double outE;
	
	public R4_4(){
		x = 2.5;
		y = -1.5;
		m = 18;
		n = 4;
	}

	public void calcA(){
		xOut = x + n * y - (x + n) * y;
	}

	public void calcB(){
		yOut= m / n + m % n;
	}

	public void calcC(){
		mOut = 5 * x - n / 5;
	}

	public void calcD(){
		nOut = (1 - (1 - (1 - (1 - n))));
	}

	public void calcE(){
		outE =Math.sqrt(Math.sqrt(n));
	}

	public double getValue(double n){
		return n;
	}


}

