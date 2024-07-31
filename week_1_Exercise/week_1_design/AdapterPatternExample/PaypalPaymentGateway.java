package AdapterPatternExample;

public class PaypalPaymentGateway {
    public void sendPayment(double amount){
        System.out.println("Processing payment of $" + amount + "through PayPal.");
    }
}
