package part_6.exercises;

public class Exercise6_3 {
    public static void main(String[] args) {
        int[] dinoWeights = { 7000, 500, 3000, 2000, 50000 };
        int minWeight = dinoWeights[0];

        for (int i = 1; i < dinoWeights.length; i++) {
            if (dinoWeights[i] < minWeight) {
                minWeight = dinoWeights[i];
            }
        }

        System.out.println("Min Weight: " + minWeight + "kg");
    }
}