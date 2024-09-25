import java.util.Scanner;

 public class IT2410228Lab7Q1A{
  public static void main(String[] args) {

    double mark1, mark2, mark3, mark4;
    double average;
    String grade;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter marks for four subjects:");
    System.out.print("Enter Subject Mark 1:");
    mark1 = input.nextDouble();
    System.out.print("Enter Subject Mark 2:");
    mark2 = input.nextDouble();
    System.out.print("Enter Subject Mark 3:");
    mark3 = input.nextDouble();
    System.out.print("Enter Subject Mark 4:");
    mark4 = input.nextDouble();

    average = (mark1 + mark2 + mark3 + mark4) / 4;
    if (average >= 75 && average <= 100) {
      grade = "Distinction";
    } else if (average <= 74 && average > 50) {
      grade = "Credit";
    } else if (average <= 49 && average >= 0) {
      grade = "Fail";
    } else {
      grade = "Fail";
    }

    System.out.println("Average is :" + average);
    System.out.println("Overall Grade is :" + grade);
  }
}