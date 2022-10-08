package PracticeExam.Ex1;

import static java.lang.String.format;

public class Main {
        public static void main(String[] args){
                Bank b = new Bank(1000, 10);
                double interest = b.calculateInterest(b.balance,b.rate);
                System.out.println("Số lãi hiện tại của bạn: " + format("%.2f", interest) + "$");
        }
}
