public class PassArgDemo
{

	static void myMethod1( int i )
	{
		i += 1;
		System.out.println("In My Method1(): " + i );
	}
	
	static int myMethod2(int i)
	{
		i*= 10;
		return i;
	}

	public static void main(String[] args)
	{
		int i = 10;
	
		//參數以primitive的型態傳入
		myMethod1(i);
	
		i = myMethod2(i);
		System.out.println(" In main(): " + i);
	}
}
