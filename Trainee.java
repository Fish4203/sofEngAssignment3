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

    id = (int) inp.nextLine();  // Read user input
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
