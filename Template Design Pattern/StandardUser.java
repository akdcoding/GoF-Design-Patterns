public class StandardUser extends User {
    @Override
    void estimatedDeliveryTime() {
       System.out.println("Estimated Delivery time: [standard delivery time]");
    }
 
    @Override
    void calculateTotal() {
       System.out.println("Subtotal: $20");
       System.out.println("Delivery Charges: $4.99");
       System.out.println("Service Taxes: $3.99");
       System.out.println("Total: 28.98");
    }
 
    @Override
    void showOffers() {
       System.out.println("how general promotional offers");
    }
}
