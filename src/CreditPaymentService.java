  public class CreditPaymentService {
      public double calculate(int creditAmount, int creditTerm, double interestRate) {
          double monthlyInterest = interestRate / 100 / 12;
          double degree = monthlyInterest / (Math.pow(1 + monthlyInterest, creditTerm) -1);
          double MonthlyPayment = creditAmount * (monthlyInterest + degree);
          double result = Math.round(MonthlyPayment);
          return result;
      }
  }