public class DeliveryAgentObserver extends Observer{

    public DeliveryAgentObserver(NotifyUser notify){
       this.notifyUser = notify;
       this.notifyUser.attach(this);
    }

    @Override
    public void updateOrderStatus() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------");	
        System.out.println("Dear delivery partner, please note that application will be down "+notifyUser.getState()); 
        System.out.println("-----------------------------------------------------------------------------------------------------------------");	
    }
 }
