public class PaymentService {
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }

    public void makeRefund(double amount) {
        paymentProcessor.refundPayment(amount);
    }
}
