public class OverloadingTest
{
	public static void main( String[] args )
	{
		int i = 10, j = 5;
		int k = myADD(i,j);
		System.out.println("The return value: " + k );
		int a = 10, b = 3;
		int w = myADD(a, b, 8 );
		System.out.println("The return value: " + w );
		double y = 10.8, z = 3.3;
		double x = myADD(y,z);
		System.out.println("The return value: " + x );
	}
	static int myADD(int a, int b )
	{
		return a+b;
	}
	static int myADD( int a, int b, int c)
	{
		return (a+b+c);
	}
	static double myADD( double a, double b)
	{
		return a+b;
	}
}
