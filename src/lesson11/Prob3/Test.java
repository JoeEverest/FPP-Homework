package lesson11.Prob3;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("12345", "Book One", "Author One");
        library.addBook("67890", "Book Two", "Author Two");
        library.addBook("11223", "Book Three", "Author Three");

        // Listing all books
        System.out.println("\nAll books in the library:");
        library.listAllBooks();

        // Borrowing a book
        System.out.println("\nBorrowing a book with ISBN 12345:");
        library.borrowBook("12345");

        // Checking if the book is borrowed
        System.out.println("\nIs book with ISBN 12345 borrowed?");
        System.out.println(library.isBookBorrowed("12345"));

        // Listing borrowed books
        System.out.println("\nBorrowed books:");
        library.listBorrowedBooks();

        // Returning a book
        System.out.println("\nReturning a book with ISBN 12345:");
        library.returnBook("12345");

        // Checking if the book is borrowed again
        System.out.println("\nIs book with ISBN 12345 borrowed?");
        System.out.println(library.isBookBorrowed("12345"));

        // Getting details of a book
        System.out.println("\nDetails of book with ISBN 67890:");
        System.out.println(library.getBookDetails("67890"));
    }
}
