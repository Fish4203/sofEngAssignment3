
import java.util.Scanner;

public class FinanceManager {
  String name;
  int id;

  public FinanceManager(String inName) {
    name = inName;
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask Databse for an id not in use:");

    id = inp.nextInt();  // Read user input
  }

  public void aprove(RefundRequest refund) {
    refund.displayInfo();

    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ask the Finance Manager if they want to approve (1 of yes and 0 for no):");

    if (inp.nextInt() == 1) {
      refund.aproved = 1;
    }
  }
}
