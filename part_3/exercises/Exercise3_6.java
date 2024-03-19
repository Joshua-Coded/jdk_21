package part_3.exercises;

public class Exercise3_6 {
    public static void main(String[] args) {
        int safetyRating = 9;
        int safetyThreshold = 8;

        boolean isAboveThreshold = safetyRating > safetyThreshold;
        System.out.println("Is the safety rating above the threshold? " + (isAboveThreshold ? "YES" : "NO"));
    }
}