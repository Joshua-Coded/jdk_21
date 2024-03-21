package part_5.exercises;

public class Exercise5_4 {
    public static void main(String[] args) {
        int totalWeight = 0;
        int[] dinoWeights = { 1000, 2000, 3000, 4000, 5000 };

        for (int weight : dinoWeights) {
            totalWeight += weight;
        }

        System.out.println("Total Weight of all dinosaurs: " + totalWeight + "kg");
    }
}