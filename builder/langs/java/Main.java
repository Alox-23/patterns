public class Main
{
	public static void main (String args[])
	{
		Human h1 = Human.builder()
		.name("Jhon")
		.build();

		h1.sayHi();
	}
}
