public class PrintHeader
{
  public static void main(String[] args)
  {
    starWelcome();
  }
  public static void starWelcome()
  {
    starLine();
    singleStarBorder();
    welcome();
    singleStarBorder();
    starLine();
  }
  public static void starLine()
  {
    System.out.println("****************");
  }
  public static void singleStarBorder()
  {
    System.out.println("*              *");
  }
  public static void welcome()
  {
    System.out.println("*   Welcome!   *");
  }
}
