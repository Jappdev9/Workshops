import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // Method to check out a book
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }

    // Method to check in a book
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    public static void main(String[] args) {
        // Creating an array to hold the inventory of books
        List<Book> inventory = new ArrayList<>();
        // Populate inventory with books
        inventory.add(new Book(1, "ISBN1", "Book 1"));
        inventory.add(new Book(2, "ISBN2", "Book 2"));
        // Add more books as needed

        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            // Displaying the home screen options
            System.out.println("Store Home Screen:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            // Getting user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Show available books
                    System.out.println("Available Books:");
                    for (Book book : inventory) {
                        if (!book.isCheckedOut()) {
                            System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                        }
                    }
                    // Prompt user to select a book or go back
                    System.out.print("Enter the ID of the book to check out or enter 'X' to go back: ");
                    String option = scanner.nextLine();
                    if (!option.equalsIgnoreCase("X")) {
                        // Check out the selected book
                        int bookId = Integer.parseInt(option);
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        for (Book book : inventory) {
                            if (book.getId() == bookId && !book.isCheckedOut()) {
                                book.checkOut(name);
                                System.out.println("Book checked out successfully!");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    // Show checked out books
                    System.out.println("Checked Out Books:");
                    for (Book book : inventory) {
                        if (book.isCheckedOut()) {
                            System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Checked Out To: " + book.getCheckedOutTo());
                        }
                    }
                    // Prompt user to check in a book or go back
                    System.out.print("Enter 'C' to check in a book or enter 'X' to go back: ");
                    option = scanner.nextLine();
                    if (option.equalsIgnoreCase("C")) {
                        // Check in a book
                        System.out.print("Enter the ID of the book to check in: ");
                        int bookId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        for (Book book : inventory) {
                            if (book.getId() == bookId && book.isCheckedOut()) {
                                book.checkIn();
                                System.out.println("Book checked in successfully!");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    // Exit the application
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
