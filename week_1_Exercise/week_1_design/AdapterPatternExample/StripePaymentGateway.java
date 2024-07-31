package AdapterPatternExample;

public class StripePaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
