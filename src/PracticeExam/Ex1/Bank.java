package PracticeExam.Ex1;

public class Bank {
        public double balance;
        public double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return rate;
    }

    public void setAnnualInterestRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(double balance, double rate) {
         return balance * (rate / 1200);
    }
}
