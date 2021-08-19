public class CreditPaymentService {
    public long calculate(double Rate) {
        double creditAmount = 1_000_000;
        double creditTerm = 24;
       double MonthlyPayment = (creditAmount / creditTerm) * Rate / 10;
        return (long) MonthlyPayment;
    }
}