package part_4.exercises;

public class Exercise4_5 {
    public static void main(String[] args) {
        String size = "b";

        switch (size) {
            case "XS":
                System.out.println("Assign the dinosaur to the Small Herbivore Enclosure.");
                break;
            case "S":
                System.out.println("Assign the dinosaur to the Medium Herbivore Enclosure.");
                break;
            case "M":
                System.out.println("Assign the dinosaur to the Large Herbivore Enclosure.");
                break;
            case "L":
            case "XL":
                System.out.println("Assign the dinosaur to the carnivored Enclosure");
                break;
            default:
                System.out.println("unknown dinner size: " + size);
                break;
        }
    }
}