public class ArraycopyDemo
{
	public static void main( String [] args )
	{
		int [] a = new int [5];
		int [] b = new int [3];

		for(int i = 0 ; i < a.length; i++)
			a[i] = i;
		System.out.println("a");
		for(int i = 0 ; i < a.length; i++)
			System.out.println( a[i] + " " );

		for(int i = 0 ; i < b.length; i++)
			b[i] = 0;
		System.arraycopy( a, 2, b, 0, 3);
		System.out.println("b");
		for(int i = 0 ; i < a.length; i++)
			System.out.println( b[i] + " " );
	}
}

