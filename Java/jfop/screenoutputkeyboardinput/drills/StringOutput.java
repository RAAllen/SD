
public class StringOutput
{
	public static void main(String[] args)
	{
		// Examine the code and add what you expect the output to be in each comment.
		// Then run the code.

		// Expected: snow  ball
		System.out.println("snow " + " ball");

		// Notice the print() statement.
		// Expected: "I could use some space" not in quotes, followed by two blank lines
		System.out.print("I could use some space\n\n");

		int tensVal = 9;
		int onesVal = 3;
		// Expected: 93
		System.out.println("Concatenated number is " + tensVal + onesVal);

		// Expected: 12
		System.out.println(tensVal + onesVal + " is another number, " + (tensVal + onesVal) + " is the same number.");
	}
}
