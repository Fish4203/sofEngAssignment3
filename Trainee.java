import java.util.Scanner;



public class Trainee {
  String name;
  String contactEmail;
  int id;

  public Trainee(String inName, String inContactEmail) {
    name = inName;
    contactEmail = inContactEmail;
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask Databse for unused id:");

    id = inp.nextInt();  // Read user input
  }

  public RefundRequest requestRefund(String incourseName) {
    return RefundRequest(incourseName, id);
  }

  public void displayRefuunds() {
    System.out.println("gets the refunds where Traineeid = id from database and displays them ");
    System.out.println("without a database i cant really write this function");
  }
}
