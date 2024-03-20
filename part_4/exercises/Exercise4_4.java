package part_4.exercises;

public class Exercise4_4 {
    public static void main(String[] args) {
        int safetyRating = 8;
        int safetyThreshold = 9;

        if (safetyRating < safetyThreshold) {
            System.out.println("Warning: The park's safety rating has fallen below the threshold");
        }
    }
}