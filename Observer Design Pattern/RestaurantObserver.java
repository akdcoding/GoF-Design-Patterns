public class RestaurantObserver extends Observer{

    public RestaurantObserver(NotifyUser notify){
       this.notifyUser = notify;
       this.notifyUser.attach(this);
    }

    @Override
    public void updateOrderStatus() {
      System.out.println("-----------------------------------------------------------------------------------------------------------------");	
      System.out.println("Dear partner, please note that application will be down "+notifyUser.getState()); 
      System.out.println("-----------------------------------------------------------------------------------------------------------------");	
   }
 }