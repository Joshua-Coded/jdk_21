package part_6.exercises;

public class Exercise6_2 {
    public static void main(String[] args) {
        int[] dinoWeights = { 7000, 50000, 500, 5000, 8000 };
        int maxWeights = dinoWeights[0];
        for (int i = 0; i < dinoWeights.length; i++) {
            if (dinoWeights[i] > maxWeights) {
                maxWeights = dinoWeights[i];
            }
        }

        System.out.println("Heaviest dinosaur weighs: " + maxWeights + "kg");
    }
}