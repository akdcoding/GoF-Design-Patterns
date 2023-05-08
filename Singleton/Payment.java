public class Payment {
   private static volatile Payment paymentInstance;
   
   private Payment() {}
   
   public static Payment getInstance() {
      if (paymentInstance == null) {
         synchronized (Payment.class) {
            if (paymentInstance == null) {
               paymentInstance = new Payment();
            }
         }
      }
      return paymentInstance;
   }
   
   public synchronized void makePayment(double amount) {
      System.out.println("Paid: $"+amount);
   }
}