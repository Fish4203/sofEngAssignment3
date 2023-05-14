import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    System.out.println("Making a trainee");

    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("enter the trainee name and email on seperate lines:");

    String name = inp.nextLine();  // Read user input
    String email = inp.nextLine();  // Read user input
    Trainee tr = new Trainee(name, email);

    System.out.println("Making a finance manager");
    System.out.println("enter the managers name:");

    name = inp.nextLine();  // Read user input
    FinanceManager fin = new FinanceManager(name);

    System.out.println("Requesting the refund");
    System.out.println("enter the courseid that the trainee wants to request a refund for:");

    String course = inp.nextLine();  // Read user input
    RefundRequest ref = tr.requestRefund(course);

    System.out.println("Finance manager reviews the refund request");

    fin.aproveRefund(ref);

    System.out.println("Trainee gets info on refund requests");

    tr.displayRefuunds();
    ref.displayInfo();


  }
}
