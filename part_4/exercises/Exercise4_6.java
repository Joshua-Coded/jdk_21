package part_4.exercises;

public class Exercise4_6 {
    public static void main(String[] args){
        double weight = 8000;

        if (weight < 500) {
            System.out.println("Feed the dinosuar once a day.");
        } else if (weight < 2000){
            System.out.println("Feed the dinosuar twice a day.");
        } else {
            System.out.println("Feed the dinosuar three times a day.");
        }
    }
}