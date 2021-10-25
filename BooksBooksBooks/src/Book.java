public class Book {

    //declaring variables
    private final String bookTitle;
    private final String author;
    private String genre;
    private final int totalPages;

    //first constructor with the genre included
    public Book(String theBookTitle, String theAuthor, int theTotalPages){

        bookTitle = theBookTitle;
        author = theAuthor;
        totalPages = theTotalPages;

    }

    //second constructor with the genre included
    public Book(String theBookTitle, String theAuthor, String theGenre, int theTotalPages){

        bookTitle = theBookTitle;
        author = theAuthor;
        genre = theGenre;
        totalPages = theTotalPages;

    }

    //static method for generating the random ratings
    public static int addRating(){
            return (int)(Math.random()*6);
        }

    //Getter for Book Title
    public String getBookTitle(){
        return bookTitle;
    }

    //Getter for Author
    public String getAuthor(){
        return author;
    }

    //Getter for Genre
    public String getGenre(){
        return genre;
    }

    //Getter for Total Pages
    public int getTotalPages(){
        return totalPages;
    }

}
