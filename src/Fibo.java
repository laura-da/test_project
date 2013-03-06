
public class Fibo {

	/**
	 * @param args
	 */
	
	public static int Fibo(int n)
	{
		if (n == 0 || n==1 ) return n;
		else return Fibo(n-1) + Fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = Fibo(5);
		System.out.println("val " + val);
	}

}
