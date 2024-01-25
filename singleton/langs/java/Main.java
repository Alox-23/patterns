import java.util.Scanner;

public class Main
{
	public static void main (String args[])
	{
		//make a java Scanner for later
		Scanner input = new Scanner(System.in);
		while (true)
		{
			//create obj and obj2 
			Singleton obj = Singleton.getInstance("true");
			Singleton obj2 = Singleton.getInstance("false");
		
			//print out the data variable in both obj
			//they should be the same becasue obj == obj2
			System.out.println("The data in obj and obj2: ");
			System.out.println("	·obj: " + obj.getData());
			System.out.println("	·obj2: " + obj2.getData());

			//print out the mem adress
			//its the same because obj2 and obj are the same object
			System.out.println("The mem adress of obj and obj2");
			System.out.println("	·obj: " + "@" + Integer.toHexString(obj.hashCode()));
			System.out.println("	·obj2: " + "@" + Integer.toHexString(obj2.hashCode()));

			//ask user to repeat the proces or exit
			System.out.println("Enter 0 if you want to exit, enter 1 if you want to run again");
			int repeat = input.nextInt();
			if (repeat == 1)
			{
				continue;
			}
			else if (repeat == 0)
			{
				break;
			}
			else
			{
				System.out.println("Invalid input! (Enter 0 or 1)");
				continue;
			}
		}
	}
}
