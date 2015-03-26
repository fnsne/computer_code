public class CatDisplay
{
	public static void main( String[] args )
	{
		Cat	cat1 = new Cat("blown");
		System.out.println("Age : " + cat1.Age );
		System.out.println("color : " + cat1.getCatsColor());
		System.out.println("Type : " + cat1.getCatsType() );

	}
}
