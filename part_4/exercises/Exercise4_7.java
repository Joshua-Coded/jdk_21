package part_4.exercises;

public class Exercise4_7 {
    public static void main(String[] args) {
        String jobTitle = "Security";

        switch (jobTitle) {
            case "Feeding":
                System.out.println("Your task here is to feed the dinosaurs...");
                break;
            case "Cleaning":
                System.out.println("Your task here is to clean the enclosure...");
                break;
            case "Security":
                System.out.println("Your task here is to ensure the park's safety...");
                break;
            case "Tour Guiding":
                System.out.println("Your task here is to guide the park's visitor...");
            default:
                System.out.println("Unknown Job Title");
                break;
        }
    }
}