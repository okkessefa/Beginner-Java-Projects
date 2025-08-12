import java.util.Arrays;

public class Library extends Book {

    String bookId;
    int bookCount;


    Library(String bookTitle, String bookAuthor, String publishYear,String bookId) {
        super(bookTitle, bookAuthor, publishYear);
        this.bookId = bookId;
    }

    private String[][] books = {
            {"Pride and Prejudice", "Jane Austen", "T. Egerton", "BN001"},
            {"1984", "George Orwell", "Secker & Warburg", "BN002"},
            {"To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", "BN003"}
    };

    public String[][] getBooks(){
        return books;
    }

    public String getBookId() {
        return bookId;
    }

    public void addBook(String bookTitle, String bookAuthor, String publishYear, String bookId){
        // Create a new array with one additional row
        String[][] newBooks = Arrays.copyOf(books , books.length + 1);

        newBooks[newBooks.length - 1] = new String[] {bookTitle, bookAuthor, publishYear, bookId};

        bookCount+=1;
        books = newBooks;
    }

}
