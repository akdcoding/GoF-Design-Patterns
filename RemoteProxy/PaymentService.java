public class PaymentService implements Payment {

    @Override
    public void makePayment(String userId) throws Exception{
        // Here the actual payment gateway is implemented

        System.out.println("Payment Recieved.");
    }
}
