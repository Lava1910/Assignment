package PracticeExam.Ex2;

public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight(20, "Tokyo");
        Flight f2 = new Flight(-1, "Tokyo");
        Flight f3 = new Flight(20, "");
        Flight f4  = new Flight(-5, "");

        f1.display();
        f2.display();
        f3.display();
        f4.display();
    }
}
