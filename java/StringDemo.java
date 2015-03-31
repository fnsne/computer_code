public class StringDemo
{
	public static void main( String[] args )
	{
		String s = "This is a book";

		System.out.println("String: " + s);
		System.out.println("substring(8): " + s.substring(8));
		System.out.println("substring(0, 6): " + s.substring(0, 6));
		System.out.println("charAt(8): " + s.charAt(8));
		System.out.println("indexOf('i'): " + s.indexOf('i'));
		System.out.println("indexOf(\"is\"): " + s.indexOf("is"));
		System.out.println("lastIndexOf('i'): " + s.lastIndexOf('i'));
		System.out.println("lastIndexOf(\"is\"): " + s.lastIndexOf("is"));
		System.out.println("startsWith(\"Th\"): " + s.startsWith("Th"));
		System.out.println("endsWith(\"ok\"): " + s.endsWith("ok"));
	}		
}
