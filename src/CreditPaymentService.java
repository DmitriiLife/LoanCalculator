  public class CreditPaymentService {
    public double calculate(double Rate) {
        double creditAmount = 1_000_000;
        int creditTerm = 12;
        double monthlyInterest = Rate / 100 / creditTerm;
        double degree = Math.pow(1 + monthlyInterest, 12);
    return creditAmount * (monthlyInterest +(monthlyInterest / (degree - 1)));

    }
    }