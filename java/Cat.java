public class Cat
{
	public int Age = 10;
	private String animalType = "feline";
	private String catColor;

	Cat( String colorIn )
	{
		catColor = colorIn;
	}

	public String getCatsColor()
	{
			return catColor;
	}

	public String getCatsType()
	{
			return animalType;
	}
}
