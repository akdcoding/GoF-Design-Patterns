public class Order {
    public static void main(String[] args) {
        Payment payment = new ProxyPaymentService();
   
           try {
               payment.makePayment("1234");
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
       }
}
