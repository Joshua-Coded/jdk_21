package part_3.exercises;

public class Exercise3_4 {
    public static void main(String[] args) {
        int maxCapacity = 10000;
        int currentVisitors = 9800;

        boolean maxCapacityReached = currentVisitors >= maxCapacity;
        System.out.println("Max capacity reached: " + maxCapacityReached);
    }
}