//Write a program that prompts the user for a String department code, a floating-point salary, and an integer employee id. Put each of the items in a separate variable, then:

//Print each of the items and a string literal label separated by a space.
//Print each of the items and a string literal label separated by a tab.
//Print each of the items and a string literal label separated by a newline.
import java.util.Scanner;

public class ThreeVariables
{
  static String departmentCode;
  static double salary;
  static int employeeID;

  public static void main(String[] args)
  {
    getUserInput();
    separateBySpace();
    separateByTab();
    newLine();
  }
  public static void getUserInput()
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter your department of employment: ");
    departmentCode = keyboard.next();
    System.out.println("Please enter your salary: ");
    salary = keyboard.nextDouble();
    System.out.println("Please enter your employee number: ");
    employeeID = keyboard.nextInt();

    keyboard.close();
  }
  public static void separateBySpace()
  {
    System.out.println(departmentCode + " " + salary + " " + employeeID);
  }
  public static void separateByTab()
  {
    System.out.println(departmentCode + "\t" + salary + "\t" + employeeID);
  }
  public static void newLine()
  {
    System.out.println(departmentCode + "\n" + salary + "\n" + employeeID);
  }
}
