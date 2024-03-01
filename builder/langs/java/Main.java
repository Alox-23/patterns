public class Main
{
	public static void main (String args[])
	{
		//make a java Scanner for later
		System.out.println("Hello world");
		
		Salad s1 = new Salad();

		s1.add_cat().add_meat().add_rock();

		s1.eat();
	}
}
