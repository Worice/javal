public class E4_4{
	public int n;
	public int m;

	public E4_4(){
		n = 0;
		m = 0;
	}

	public void sum(){
		System.out.println(m + n);
	}
	public void dif(){
		System.out.println(m - n);
	}
	public void mul(){
		System.out.println(m * n);
	}
	public void avg(){
		System.out.println((m + n)/2);
	}

	public void absV(){
		System.out.println(Math.abs(m - n));
	}
	public void minV(){
		System.out.println(Math.min(m, n));
	}
	public void maxV(){
		System.out.println(Math.max(m, n));
	}
}
