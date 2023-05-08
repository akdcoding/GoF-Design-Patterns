public class Order {
    public static void main(String[] args) {
        User user = new StandardUser();
        System.out.println("Standard Customer");
        System.out.println("-------------------------");
        user.estimatedDeliveryTime();
        user.calculateTotal();
        user.showOffers();

        System.out.println("-------------------------");

        System.out.println("Premium Customer");
        System.out.println("-------------------------");
        user = new PremiumUser();
        user.estimatedDeliveryTime();
        user.calculateTotal();
        user.showOffers();		
     }
}
