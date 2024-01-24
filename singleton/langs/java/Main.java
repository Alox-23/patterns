import java.util.Scanner;

public class Main
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		while (true)
		{
			Singleton obj = Singleton.getInstance("true");
			
			//janky, unsafe prototype-code incoming		
			System.out.println("Do you want to delete Singleton obj? 0(delete) 1(continue)");
			int player_in = input.nextInt();
			if (player_in == 0)
			{
				obj.nullify();
			}
			else if (player_in == 1)
			{
				System.out.println("Singleton obj not deleted");
			}
			else
			{
				System.out.println("Please enter 0 or 1");
				continue;
			}

			Singleton obj2 = Singleton.getInstance("false");

			System.out.println(obj2.getData());
		}
	}
}
