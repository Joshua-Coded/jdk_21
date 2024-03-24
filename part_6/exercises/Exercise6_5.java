package part_6.exercises;

public class Exercise6_5 {
    public static void main(String[] args) {
        int[] dinoAge = { 10, 4, 6, 234, 64 };
        int totalAge = 0;

        for (int age : dinoAge) {
            totalAge += age;
        }

        double averageAge = (double) totalAge / dinoAge.length;
        System.out.println("Average age: " + averageAge);
    }
}