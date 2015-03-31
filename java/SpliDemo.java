public class SpliDemo
{
	public static void main( String[] args )
	{
		String name = "John, Ted, JoJo ";
		String[] token = name.split( ",");
		for( int i = 0 ; i < token.length ; i++ )
			System.out.println(token[i]);
	}
}

		
