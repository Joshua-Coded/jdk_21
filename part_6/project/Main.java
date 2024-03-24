package part_6.project;

public class Main {
    public static void main(String[] args) {
        String[] dinoName = new String[10];
        int[] dinoAge = new int[10];
        String[] dinoSpecies = new String[10];
        int[] dinoEnclosures = new int[10];

        // add contents to the arrays

        for (int i = 0; i < 5; i++) {
            dinoName[i] = "Dino " + (i + 1);
            dinoAge[i] = (i + 1) * 2;
            dinoSpecies[i] = "Species " + (i + 1);
            dinoEnclosures[i] = (i + 1);
        }

        // showing the details
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + dinoName[i] + ", Age: " + dinoAge[i] + ", Species: " + dinoSpecies[i]
                    + ", Enclosures: " + dinoEnclosures[i]);
        }

        // calculate the average age
        int totalAge = 0;
        for (int age : dinoAge) {
            totalAge += age;
        }

        double averageAge = (double) totalAge / 5;
        System.out.println("Average age: " + averageAge);
    }
}