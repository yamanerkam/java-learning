public class PayPalProcessor implements  PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("process is "+amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("refund is "+amount);

    }
}
