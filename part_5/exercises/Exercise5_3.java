package part_5.exercises;

public class Exercise5_3 {
    public static void main(String[] args) {
        int countdown = 10;

        while (countdown >= 0) {
            System.out.println("Park opening is " + countdown + " seconds..");
            countdown = countdown - 1;
        }
    }
}