import java.util.Scanner;

public class RefundRequest {
  // definitions
  String courseName;
  int aproved;
  int amount;
  int traineeid;

  public RefundRequest(String incourseName, int inTraineeid) {
    // assigning the basic info
    courseName = incourseName;
    traineeid = inTraineeid;

    // gets the refnd amout from the database
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask Databse for the cost of the course with courseName:" + incourseName);

    amount = inp.nextInt();  // Read user input

    // sets the aproved status to pending
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
