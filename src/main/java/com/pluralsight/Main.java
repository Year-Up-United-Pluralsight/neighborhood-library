package com.pluralsight;

import java.util.Scanner;

public class Main {

    // It's private bc there is no reason for us to use it outside of main
    private static Scanner scanner = new Scanner(System.in);

    // private static Console console = new Console(System.in); - if you want to use Console as helper function

    public static void main(String[] args) {

        Book[] books = getPopulatedBooks();


        showScreenHome(books);

    }

    private static Book[] getPopulatedBooks() {

        Book[] library = new Book[20];

        library[0] = new Book(1, "ISBN 978-1-78862-355-1", "Frankenstein by Mary Shelley");
        library[1] = new Book(2, "ISBN 978-0-14-143951-8", "Pride and Prejudice by Jane Austen");
        library[2] = new Book(3, "ISBN 978-0-14-144114-6", "Jane Eyre by Charlotte Brontë");
        library[3] = new Book(4, "ISBN 978-0-14-143960-0", "Wuthering Heights by Emily Brontë");
        library[4] = new Book(5, "ISBN 978-0-14-143956-3", "Great Expectations by Charles Dickens");
        library[5] = new Book(6, "ISBN 978-0-14-143960-0", "A Tale of Two Cities by Charles Dickens");
        library[6] = new Book(7, "ISBN 978-0-14-143947-1", "Dracula by Bram Stoker");
        library[7] = new Book(8, "ISBN 978-0-452-28423-4", "1984 by George Orwell");
        library[8] = new Book(9, "ISBN 978-0-452-28424-1", "Animal Farm by George Orwell");
        library[9] = new Book(10, "ISBN 978-0-15-662870-9", "To the Lighthouse by Virginia Woolf");
        library[10] = new Book(11, "ISBN 978-0-15-662870-9", "Mrs. Dalloway by Virginia Woolf");
        library[11] = new Book(12, "ISBN 978-0-14-143957-0", "The Picture of Dorian Gray by Oscar Wilde");
        library[12] = new Book(13, "ISBN 978-0-06-085052-4", "Brave New World by Aldous Huxley");
        library[13] = new Book(14, "ISBN 978-0-14-042438-6", "The Canterbury Tales by Geoffrey Chaucer");
        library[14] = new Book(15, "ISBN 978-0-571-05686-6", "Lord of the Flies by William Golding");
        library[15] = new Book(16, "ISBN 978-0-19-953622-0", "Dr Jekyll and Mr Hyde by Robert Louis Stevenson");
        library[16] = new Book(17, "ISBN 978-0-14-132100-4", "Treasure Island by Robert Louis Stevenson");
        library[17] = new Book(18, "ISBN 978-0-19-964617-2", "The Secret Garden by Frances Hodgson Burnett");
        library[18] = new Book(19, "ISBN 978-0-14-043512-4", "Far from the Madding Crowd by Thomas Hardy");
        library[19] = new Book(20, "ISBN 978-0-14-043474-5", "The Tenant of Wildfell Hall by Anne Brontë");

        return library;
    }

    private static void showScreenHome(Book[] books) {

        String homeScreenPrompt = "Welcome to the library!\n" +
                "Please select an option from the following:\n" +
                "   1 - Show Available Books\n" +
                "   2 - Show Checked Out Books\n" +
                "   0 - Exit App\n" +
                "(1,2,0): ";

        int option;

        do {
            System.out.println(homeScreenPrompt);
            option = scanner.nextInt();
            scanner.nextLine();


            if (option == 1){
                showScreenAvailableBooks(books);
            }

            else if (option == 2) {
                showScreenCheckedOutBooks(books);
            }

            else if (option == 0){
                System.out.println("Exiting the library, have a nice day!");
            }
            else {
                System.out.println("Not a valid option, please try again");
            }

        } while(option != 0);


    }

    private static void showScreenAvailableBooks(Book[] books) {

        // Displays a list of all books that are not currently checked out

        // Loop through the list of all books; checks which ones are not currently checked out
        for (Book book : books){
            if (!book.isCheckedOut()){
                System.out.println("Book ID: " + book.getId() + "; ISBN: " +  book.getIsbn() + "; Title: " + book.getTitle());
            }
        }

        // Prompt the user to either select a book to check out, or exit to go back to the home screen
        System.out.println("Would you like to check out a book? (Or exit back to home screen.)");
        String prompt = scanner.nextLine();

        // If the user wants to check out a book, prompt them for their name
        if (prompt.equalsIgnoreCase("Yes")){

            System.out.println("Which book would you like to check out?");
            String bookTitle = scanner.nextLine();

            System.out.println("What is your name?");
            String userName = scanner.nextLine();

            for (Book book : books){
                if (book.getTitle().equals(bookTitle)){  // If the title of a book from the books array, matches...
                    book.checkOut(userName);            // Then checks out the book

                    System.out.println(book.getTitle() + " has been checked out!");
                }
            }

        }

    }

    private static void showScreenCheckedOutBooks(Book[] books) {

        // Displays a list of all books that are currently checked out

        // Loop through the list of all books; checks which ones aare currently checked out
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println("Book ID: " + book.getId() + "; ISBN: " + book.getIsbn() + "; Title: " + book.getTitle() + "; Checked Out By: " + book.getCheckedOutTo());
            }
        }

        System.out.println("Press C to check in a book, or press X to go back to the home screen");
        String userChoice = scanner.nextLine();

        if (userChoice.equalsIgnoreCase("C")) {

            System.out.println("Which book would you like to check in?");
            String bookTitle = scanner.nextLine();


            for (Book book : books) {
                if (book.getTitle().equals(bookTitle)) {  // If the title of a book from the books array, matches...
                    book.checkIn();            // Then checks in the book

                    System.out.println(book.getTitle() + " has been checked in!");
                }
            }


        }
    }

    private static void checkInBook(Book[] books){

        System.out.println("What is the ID of the book you'd like to check in?");
        int bookId = scanner.nextInt();

        // Loop through the list of all books; checks which ones aare currently checked out
        for (Book book : books) {
            if (book.getId() == bookId) {

                book.checkIn();

                System.out.println(book.getTitle() + " has been checked in!");

            }
        }

    }
}