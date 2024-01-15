public class CreditPaymentService {
    public double calculate(int creditAmount, int creditTerm) {
        int multipliedCreditTerm = creditTerm * 12;
        double interestRate = 9.99;
        double monthlyInterestRate = interestRate / (100 * 12);
        double numerator = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, multipliedCreditTerm));
        double denominator = (Math.pow(1 + monthlyInterestRate, multipliedCreditTerm)) - 1;
        double monthlyPayment = creditAmount * (numerator / denominator);
        return monthlyPayment;
    }
}