public class Fib
{
	static long fib( int num )
	{
		if( (num == 1) || (num == 2 ))
				return 1;
		else{
			return fib(num-1) + fib( num-2 );
		}
	}
	public static void main( String[] args )
	{
		int num = Integer.parseInt( args[0] );
		System.out.println("fib(" + num + ") = " + fib(num) );
	}
}
