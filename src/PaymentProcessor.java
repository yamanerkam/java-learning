public interface PaymentProcessor {
    int creditLimit = 20;
    void processPayment(double amount);
    void refundPayment(double amount);

}
