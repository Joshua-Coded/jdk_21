package part_7.project;

import java.util.Scanner;

public class Main {
    // read the input from users
    Scanner sc = new Scanner(System.in);

    // initialize array to store the information
    String[] dinoNames = new String[10];
    int[] dinoAge = new int[10];
    int[] dinoWeight = new int[10];
    int dinoCount = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();

    }

    // cerate the start method
    public void start() {
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            handleMenuChoice(choice);
        }
    }

    // create the display method
    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Add Dinosaur");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitors Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }

    // switch cases for the methods
    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addDinosaur();
                break;
            case 2:
                checkParkHours();
                break;
            case 3:
                // greetGuest();
                break;
            case 4:
                // checkVisibilityCount();
                break;
            case 5:
                // manageStaff();
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }

    // methods for addDinosaur
    public void addDinosaur() {
        if (dinoCount >= 10) {
            System.out.println("The park is at full capacity. No more dinosaurs can be added.");
            return;
        }

        // logic for adding dinosaurs
        sc.nextLine(); // clears the input
        System.out.println("Enter dinosaur name: ");
        dinoNames[dinoCount] = sc.nextLine();
        System.out.println("Enter dinosaur age: ");
        dinoAge[dinoCount] = sc.nextInt();
        System.out.println("Enter Dinosaur weight: ");
        dinoWeight[dinoCount] = sc.nextInt();
        dinoCount++;

        System.out.println(dinoNames[dinoCount - 1] + " has been added to the park!");
    }

    public void checkParkHours() {
        // let's assume the park opens from 6am to 8pm
        int currentHour = java.time.LocalDateTime.now().getHour();
        if (currentHour >= 6 && currentHour < 20) {
            System.out.println("The park is currently open");
        } else {
            System.out.println("The park is closed.");
        }
    }
}