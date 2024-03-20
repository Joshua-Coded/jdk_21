package part_4.projects;

public class Main {
    public static void main(String[] args) {
        String role = "Feeding";
        int time = 14;
        int safetyRating = 9;

        switch (role) {
            case "Feeding":
                if (time >= 7 && time <= 19) {
                    System.out.println("Your task is to feed the dinosaurs...");
                } else {
                    System.out.println("Feeding time is over. Please assist with cleaning tasks.");
                }
                break;
            case "Cleaning":
                System.out.println("Your task is to clean the parks...");
                break;
            case "Security":
                if (safetyRating < 9) {
                    System.out.println("Alert!. The park's safety rating has fallen. Increase the surveillance.");
                } else {
                    System.out.println("Your task is to ensure the park's safety");
                }
                break;
            case "Tour Guiding":
                if (time >= 10 && time <= 19) {
                    System.out.println("Your task is to guide the park's visitors.");
                } else {
                    System.out.println("Tour Guiding time is over. Please assist with other tasks.");
                }
                break;
            default:
                System.out.println("unknown job title");
                break;
        }
    }
}