public class CustomerObserver extends Observer{

    public CustomerObserver(NotifyUser notify){
       this.notifyUser = notify;
       this.notifyUser.attach(this);
    }

    @Override
    public void updateOrderStatus() {
      System.out.println("-----------------------------------------------------------------------------------------------------------------");	
      System.out.println("Dear customer, please note that application will be down "+notifyUser.getState());
      System.out.println("-----------------------------------------------------------------------------------------------------------------");	
 
   }
 }