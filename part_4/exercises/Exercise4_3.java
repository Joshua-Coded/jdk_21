package part_4.exercises;

public class Exercise4_3 {
    public static void main(String[] args) {
        int yearsExperience = 2;
        String dinosaurType = "T-Rex";

        if (dinosaurType.equals("T-Rex") && yearsExperience < 10) {
            System.out.println("You need more experience to work with " + dinosaurType);
        }
    }
}