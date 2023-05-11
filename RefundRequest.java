import java.util.Scanner;

public class RefundRequest {
  String courseName;
  int aproved;
  int amount;
  int Traineeid;

  public RefundRequest(String incourseName, int inTraineeid) {
    courseName = incourseName;
    Traineeid = inTraineeid;
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask Databse for the cost of the course with courseName:");

    amount = inp.nextInt();  // Read user input
    aproved = 0;
  }

  public void displayInfo() {
    System.out.println("course name:" + courseName);
    System.out.println("aproved:" + aproved);
    System.out.println("amount:" + amount);
    System.out.println("Trainee:" + Traineeid);
  }
}
