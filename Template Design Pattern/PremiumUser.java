public class PremiumUser extends User{
    @Override
    void estimatedDeliveryTime() {
       System.out.println("Estimated Delivery time: [priority delivery time]");
    }
 
    @Override
    void calculateTotal() {
       System.out.println("Subtotal: $20");

       // No delivery charges for premium membership
       System.out.println("Delivery Charges: $0.00");

       // 50% off on services taxes for premium users
       System.out.println("Service Taxes: $1.99");

       System.out.println("Total: 21.99");
    }
 
    @Override
    void showOffers() {
       System.out.println("Exclusiv offers!!!");
    }
}
