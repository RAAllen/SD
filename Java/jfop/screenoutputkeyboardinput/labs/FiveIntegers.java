//Prompt the user for 5 integers.
//Print each of the numbers separated by a space.
//Print each of the numbers separated by a tab.
//Print each of the numbers separated by a newline.
import java.util.Scanner;

public class FiveIntegers
{
  static int userInput1, userInput2, userInput3, userInput4, userInput5;
  public static void main(String[] args)
  {
    getUserIntegers();
    separateBySpace();
    separateByTab();
    separateByNewLine();
  }
  public static void getUserIntegers()
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter an integer: ");
    userInput1 = keyboard.nextInt();
    System.out.println("Please enter another integer: ");
    userInput2 = keyboard.nextInt();
    System.out.println("Please enter another integer: ");
    userInput3 = keyboard.nextInt();
    System.out.println("Please enter another integer: ");
    userInput4 = keyboard.nextInt();
    System.out.println("Please enter another integer: ");
    userInput5 = keyboard.nextInt();

    keyboard.close();
  }
  public static void separateBySpace()
  {
    System.out.println(userInput1 + " " + userInput2 + " " + userInput3 + " " + userInput4 + " " + userInput5);
  }
  public static void separateByTab()
  {
    System.out.println(userInput1 + "\t" + userInput2 + "\t" + userInput3 + "\t" + userInput4 + "\t" + userInput5);
  }
  public static void separateByNewLine()
  {
    System.out.println(userInput1 + "\n" + userInput2 + "\n" + userInput3 + "\n" + userInput4 + "\n" + userInput5);
  }
}
