package part_4.exercises;

public class Exercise4_2 {
    public static void main(String[] args) {
        String species = "";

        switch (species) {
            case "T-rex":
                System.out.println("The T-rex is a large and powerful dinosaurs");
                break;
            case "Velociraptor":
                System.out.println("The Velociraptor is a small, agile and intelligent dinosaurs");
                break;
            default:
                System.out.println("Unknown dinosaur species");
                break;
        }
    }
}