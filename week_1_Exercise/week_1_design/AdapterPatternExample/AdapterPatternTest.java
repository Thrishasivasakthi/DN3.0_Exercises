package AdapterPatternExample;

public class AdapterPatternTest {
    public  static void main(String[] args) {
        // Create instances of the payment gateways
        PaypalPaymentGateway paypal = new PaypalPaymentGateway();
        StripePaymentGateway stripe = new StripePaymentGateway();

        // Create adapter instances
        PaymentProcessor paypalAdapter = new PaypalAdapter(paypal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        // Process payments using adapters
        paypalAdapter.processPayment(100.00);
        stripeAdapter.processPayment(200.00);
    }
}

