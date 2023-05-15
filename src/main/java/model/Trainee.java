import java.util.Scanner;

public class Trainee {
  // basic trainee info
  String name;
  String contactEmail;
  // a unique id
  int id;

  public Trainee(String inName, String inContactEmail) {
    // assigning the basic info
    name = inName;
    contactEmail = inContactEmail;

    // gets the database to assign an id
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask Databse for unused trainee id:");

    id = inp.nextInt();  // Read user input
  }

  public RefundRequest requestRefund(String incourseName) {
    // gets the database to assign an id
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask Databse for unused refund id:");

    id = inp.nextInt();  // Read user input

    // creates a new RefundRequest with the course name and the id of the trainee
    return new RefundRequest(incourseName, id);
  }

  public void displayRefuunds() {
    System.out.println("gets the refunds where Traineeid = id from database and displays them ");
    System.out.println("a proper implmentation would acess the database something like this:");
    System.out.println("SELECT * FROM RefundRequests WHERE traineeid = id");

  }
}
