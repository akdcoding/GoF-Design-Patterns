

public class Order{
    public void processOrder(double amount) {
        Payment payment = Payment.getInstance();
        payment.makePayment(amount);
    }

    public static void main (String[] arg) {
        Order newOrder = new Order();
        int amount = 50;
        newOrder.processOrder(amount);
    }
}