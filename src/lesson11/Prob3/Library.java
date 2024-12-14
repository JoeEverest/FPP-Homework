package lesson11.Prob3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> books;

    public Library() {
        this.books =  new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author){
        if(ISBN == null || ISBN.isEmpty()) return;
        if(title == null || title.isEmpty()) return;
        if(author == null || author.isEmpty()) return;

        if(books.get(ISBN) != null){
            System.out.println("Book already exists");
            return;
        }
        Book book = new Book(ISBN, title, author);
        books.put(ISBN, book);

        System.out.println("Book added successfully "+book);
    }

    public void borrowBook(String ISBN){
        if(ISBN == null || ISBN.isEmpty()) return;

        Book book = books.get(ISBN);

        if(book == null) {
            System.out.println("We don't have that book");
            return;
        }

        if(book.isBorrowed()){
            System.out.println("Book already borrowed");
            return;
        }

        book.setBorrowed(true);
        System.out.println("Your book has been borrowed successfully");

    }

    public void returnBook(String ISBN){
        if(ISBN == null || ISBN.isEmpty()) return;

        Book book = books.get(ISBN);

        if(book == null) {
            System.out.println("We don't own that book");
            return;
        }

        if(!book.isBorrowed()){
            System.out.println("There's an error, it appears the book was never borrowed");
            return;
        }

        book.setBorrowed(false);
        System.out.println("Your book has been returned successfully");

    }

    public boolean isBookBorrowed(String ISBN){
        if(ISBN == null || ISBN.isEmpty()) return false;

        Book book = books.get(ISBN);

        if(book == null) {
            System.out.println("We don't own that book");
            return false;
        }

        return book.isBorrowed();
    }

    public Book getBookDetails(String ISBN){
        if(ISBN == null || ISBN.isEmpty()) return null;

        Book book = books.get(ISBN);

        if(book == null) {
            System.out.println("We don't own that book");
            return null;
        }

        return book;
    }

    public void listAllBooks(){
        for (Book b: books.values()){
            System.out.println(b);
        }
    }

    public void listBorrowedBooks(){
        for (Book b: books.values()){
            if(b.isBorrowed()){
                System.out.println(b);
            }
        }
    }
}
