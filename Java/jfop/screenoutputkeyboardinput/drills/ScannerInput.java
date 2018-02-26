import java.util.Scanner;

public class ScannerInput
{
	public static void main(String[] args)
	{
		// Add a prompt to the code so that the user knows to enter data. Output the data.

		int yearBorn;

		Scanner keyboard = new Scanner(System.in);

		// add a prompt...
		System.out.println("What year were you born? ");
		yearBorn = keyboard.nextInt();

		// output the data...
		System.out.println("You were born in " + yearBorn + "? Wow, you're getting old.");
		// Run the program.

		keyboard.close();
	}
}
