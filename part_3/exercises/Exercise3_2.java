package part_3.exercises;

public class Exercise3_2 {
    public static void main(String[] args) {
        double dinoWeight = 8000;
        double foodPerWeightUnit = 0.05;

        double foodNeeded = dinoWeight * foodPerWeightUnit;
        System.out.println("Food needed for the Dinosuar: " + foodNeeded + "kg");
    }
}