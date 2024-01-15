public class CreditPaymentService {
    public double calculate(int creditAmount, int creditTerm) {
        if (creditTerm == 1) {
            creditTerm = 12;
        };
        if (creditTerm == 2) {
            creditTerm = 24;
        };
        if (creditTerm == 3) {
            creditTerm = 36;
        };
        double interestRate = 9.99;
        double monthlyInterestRate = interestRate / (100 * 12);
        double numerator = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, creditTerm));
        double denominator = (Math.pow(1 + monthlyInterestRate, creditTerm)) - 1;
        double monthlyPayment = creditAmount * (numerator/denominator);
        return monthlyPayment;
    }
}