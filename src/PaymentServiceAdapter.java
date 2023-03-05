public class PaymentServiceAdapter implements PaymentService {
    private RestaurantPaymentSystem restaurantPaymentSystem;

    public PaymentServiceAdapter(RestaurantPaymentSystem restaurantPaymentSystem) {
        this.restaurantPaymentSystem = restaurantPaymentSystem;
    }

    @Override
    public void processPayment(double amount) {
        // Convert the payment request to the format that the restaurant payment system expects
        // and call the appropriate method
        System.out.println("Processing payment of " + amount + " using payment service adapter.");
        restaurantPaymentSystem.processPayment(amount * 0.9); // Apply a 10% discount for using the payment service adapter
    }
}