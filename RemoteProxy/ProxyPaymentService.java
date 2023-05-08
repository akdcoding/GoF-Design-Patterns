import java.util.Scanner;

public class ProxyPaymentService implements Payment{
    private PaymentService payment = new PaymentService();
    private String cvv;

    private void getUserPaymentInfo(String userId){
        // Here we can make an API call to get encrypted cvv
    
        this.cvv = "122";
    }

    private String getCvvInput(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter CVV: ");
            String cvv = scanner.nextLine();

            // Here we can encypt the cvv entered by user
            return cvv;
        }
    }

    @Override
    public void makePayment(String userId) throws Exception{
        String cvv = getCvvInput();
        this.getUserPaymentInfo("456789");

        if (!cvv.equals(this.cvv)){
            throw new Exception("Please provide correct CVV");
        }
        payment.makePayment(userId);
    }
}
