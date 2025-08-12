import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("", "", "", ""); // Create a Library instance (fields can be empty for now)

        boolean running = true;

        while (running) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. List all books");
            System.out.println("2. Add a new book");
            System.out.println("3. Search book by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // List all books
                    String[][] books = library.getBooks();
                    System.out.println("\nBooks in the library:");
                    for (int i = 0; i < books.length; i++) {
                        System.out.printf("%d. Title: %s | Author: %s | Publisher: %s | ID: %s\n",
                                i + 1, books[i][0], books[i][1], books[i][2], books[i][3]);
                    }
                    break;

                case 2:
                    // Add a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter publisher name: ");
                    String publisher = scanner.nextLine();

                    System.out.print("Enter book ID: ");
                    String id = scanner.nextLine();

                    library.addBook(title, author, publisher, id);
                    System.out.println("Book added successfully!");
                    break;

                case 3:
                    // Search book by ID
                    System.out.print("Enter book ID to search: ");
                    String searchId = scanner.nextLine();

                    String[][] allBooks = library.getBooks();
                    boolean found = false;

                    for (String[] book : allBooks) {
                        if (book[3].equalsIgnoreCase(searchId)) {
                            System.out.println("Book found:");
                            System.out.printf("Title: %s | Author: %s | Publisher: %s | ID: %s\n",
                                    book[0], book[1], book[2], book[3]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No book found with ID: " + searchId);
                    }
                    break;

                case 4:
                    // Exit program
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }

        scanner.close();

    }
}
