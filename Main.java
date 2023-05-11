public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    RefundRequest refund = new RefundRequest("good course", 1);

    refund.displayInfo();
    refund.aprove(2);
  }
}
