import java.util.Scanner;

public class RefundRequest {
  String courseName;
  int aproved;
  int amount;
  int traineeid;

  public RefundRequest(String incourseName, int inTraineeid) {
    courseName = incourseName;
    traineeid = inTraineeid;
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask Databse for the cost of the course with courseName:" + incourseName);

    amount = inp.nextInt();  // Read user input
    aproved = 0;
  }

  public void displayInfo() {
    System.out.println("Refund request status");
    System.out.println("course name:" + courseName);
    System.out.println("amount:" + amount);
    System.out.println("Trainee:" + traineeid);
    if (aproved == 0) {
      System.out.println("pending review");
    } else if (aproved == 1) {
      System.out.println("approved");
    } else {
      System.out.println("refund denied");
    }
  }
}
