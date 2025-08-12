public class Book {
    String bookTitle;
    String bookAuthor;
    String publishYear;

    Book(String bookTitle, String bookAuthor, String publishYear){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publishYear = publishYear;
    }


    public String getBookName(){
        return bookTitle;
    }
    public String getAuthorName(){
        return bookAuthor;
    }
    public String getPublishYear(){
        return publishYear;
    }
}
