public abstract class User {
    abstract void estimatedDeliveryTime();
    abstract void calculateTotal();
    abstract void showOffers();
 
    //template method
    public final void placeOrder(){
 
       //calculate estimated delivery time
       estimatedDeliveryTime();

        //show exclusive offers to premium users
       showOffers();

       //calculate total 
       calculateTotal();
    }
 }
 