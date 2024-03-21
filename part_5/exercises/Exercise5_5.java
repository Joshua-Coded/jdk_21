package part_5.exercises;

public class Exercise5_5 {
    public static void main(String[] args) {
        int ticketsLeft = 200;

        while (ticketsLeft > 0) {
            System.out.println("Selling Ticket....");
            ticketsLeft--;
        }

        System.out.println("All tickets are sold out");
    }
}