package com.pluralsight;
import java.util.Scanner;

public class HomeScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canvasSize = promptForCanvasSize(scanner);
        HomeScreen homeScreen = new HomeScreen(scanner, canvasSize);

        homeScreen.display();
    }

    private static int promptForCanvasSize(Scanner scanner) {
        System.out.print("Enter the size of the world canvas: ");
        return scanner.nextInt();
    }
}

class HomeScreen {
    private Scanner scanner;
    private int canvasSize;

    public HomeScreen(Scanner scanner, int canvasSize) {
        this.scanner = scanner;
        this.canvasSize = canvasSize;
    }

    public void display() {
        boolean running = true;

        while (running) {
            System.out.println("\nHome Screen");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addShape();
                    break;
                case 2:
                    saveImage();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Exiting application.");
    }

    private void addShape() {
        System.out.println("Which shape (1. square, 2. circle, 3. triangle)?");
        int shapeChoice = scanner.nextInt();
        switch (shapeChoice) {
            case 1:
                addSquare();
                break;
            case 2:
                addCircle();
                break;
            case 3:
                addTriangle();
                break;
            default:
                System.out.println("Invalid shape choice.");
        }
    }

    private void addSquare() {
        System.out.println("Enter the size of the square:");
        int size = scanner.nextInt();
        System.out.println("Enter the border width:");
        int borderWidth = scanner.nextInt();
        System.out.println("Enter the border color:");
        String borderColor = scanner.next();
        System.out.println("Enter the location (x, y) of the square:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // Code to paint the square on the canvas
    }

    private void addCircle() {
        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();
        System.out.println("Enter the border width:");
        int borderWidth = scanner.nextInt();
        System.out.println("Enter the border color:");
        String borderColor = scanner.next();
        System.out.println("Enter the location (x, y) of the circle:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // Code to paint the circle on the canvas
    }

    private void addTriangle() {
        System.out.println("Enter the base and height of the triangle:");
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        System.out.println("Enter the border width:");
        int borderWidth = scanner.nextInt();
        System.out.println("Enter the border color:");
        String borderColor = scanner.next();
        System.out.println("Enter the location (x, y) of the triangle:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // Code to paint the triangle on the canvas
    }

    private void saveImage() {
        System.out.println("Saving image...");
        // Code to save the canvas image
    }
}
}
