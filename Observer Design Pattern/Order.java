public class Order {
    public static void main(String[] args) {
       NotifyUser notifyUser = new NotifyUser();
 
       // This object creates the observer
       new CustomerObserver(notifyUser);
       new RestaurantObserver(notifyUser);
       new DeliveryAgentObserver(notifyUser);
 
       System.out.println("Application down for maintainance!");	
       System.out.println("-------------------------------------------------------");	
       notifyUser.setState("from 12 am to 3 pm for scheduled maintainance");

    }
 }