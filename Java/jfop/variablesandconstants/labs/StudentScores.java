//Write a program that defines four variables named score1, score2, score3, and score4 — one for each of a student's four test scores. Assign appropriate values to the variables. Define another variable named average in the program. Have the program calculate the average of the test scores and assign the result to the variable:

//average = (score1 + score2 + score3 + score4) / 4;
//Print out the four test scores and the average.

public class StudentScores
{
  public static void main(String[] args)
  {
    int score1 = 95, score2 = 83, score3 = 75, score4 = 88;
    double average;

    average = (score1 + score2 + score3 + score4) / 4;

    System.out.println("Your GPA is: " + average + ".");
  }
}
