public class Add
{
	static void printAdd2N(int max)
	{
		int sum = 0;
		sum = getAdd2N(max);
		System.out.println("sum = " + sum);
	}

	static int getAdd2N( int max )
	{
		int sum = 0;
		for(int i =1; i <= max ; i++)
			sum += i;
		return sum;
	}

	public static void main( String[] args )
	{
		int max = Integer.parseInt( args[0] );
		printAdd2N( max );
	}
}
