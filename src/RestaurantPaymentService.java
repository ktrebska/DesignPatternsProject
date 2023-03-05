public class RestaurantPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using restaurant payment system.");
    }
}
