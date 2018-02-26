public class MyName
{
  public static void main(String[] args)
  {
    firstName();
    space();
    lastName();
    System.out.println();
    fullName();
  }
  public static void firstName()
  {
    System.out.print("Rebecca");
  }
  public static void lastName()
  {
    System.out.print("Allen");
  }
  public static void space()
  {
    System.out.print(" ");
  }
  public static void fullName()
  {
    firstName();
    space();
    lastName();
  }
}
