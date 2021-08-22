public class Main        {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double interestRate = 9.99;
        double MonthlyPayment = service.calculate(1_000_000, 12, 9.99);
        // CreditTerm = срок кредита в месяцах
        System.out.println("Ежемесячный платёж " + MonthlyPayment);
        System.out.println("Процентная ставка " + interestRate);

            }
        }