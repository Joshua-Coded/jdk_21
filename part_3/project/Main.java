package part_3.project;

public class Main {
    public static void main(String[] args) {
        double dinoWeight = 2000;
        double dailyProportion = 0.06;

        double dailyFood = dinoWeight * dailyProportion;

        int feedingsPerDay = 2;

        double foodPerFeeding = dailyFood / feedingsPerDay;
        System.out.println("Our " + dinoWeight + "kg dinosaur needs to eat " + dailyFood
                + "kg daily, which means we need to serve " + foodPerFeeding + "kg per feeding.");
    }
}