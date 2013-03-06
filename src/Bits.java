//You are given two 32-bit numbers, N and M, and two bit positions, i and j Write a
//method to set all bits between i and j in N equal to M (e g , M becomes a substring of
//N located at i and starting at j)
//
//EXAMPLE:
//
//Input: N = 100 0000 0000, M = 10101, i = 2, j = 6
//
//Output: N = 10001010100

public class Bits {

	public static int setBits(int N, int M, int i, int j)
	{
		int k = 0;
		for (int l = i; l <= j; l++ )
		{
			//the bit l in N will be M
			System.out.println("Bit " + l +" value " +  get_bit(M,l) );
			N = set_bit(N, l, get_bit(M,k));
			k++;
		}
		return N;
	}
	
	static int get_bit(int decimal, int pos){
		 
		 // Shifting the 1 for N bits
		 int constant = 1 << pos;
		 
		 // if the bit is set, return 1
		 if( (decimal & constant) != 0){
		  return 1;
		 }
		 
		 // If the bit is not set, return 0
		 return 0;
	}
	
	static int set_bit(int decimal, int pos, int val)
	{
		// Shifting the 1 for N bits
		int constant = 1 << pos;
		if (val != 0)
		{
			return (decimal | constant);
		}
		else
		{
			return (decimal & ~constant);
		}
	}
	
	public static void main (String[] args)
	{
		int N = 0x400;
		int M = 0x15;
	    String NB=  Integer.toBinaryString(N);
	    String MB=  Integer.toBinaryString(M);
	    System.out.println("NB " + NB + " MB " + MB);
	    
	    int R = set_bit(M, 2, 0);
	    String RB=  Integer.toBinaryString(R);
	    System.out.println("R " + R + " RB " + RB);
	    
//	    for (int i=0; i<31 ; i++)
//	    {
//	    	int bit = get_bit(M, i);
//	    	System.out.println(" i = " + i + " bit " + bit);
//	    }
	    
	    N = setBits(N, M, 2, 6);
        NB=  Integer.toBinaryString(N);
	    System.out.println("NB ---> " + NB);
	}
	
}
