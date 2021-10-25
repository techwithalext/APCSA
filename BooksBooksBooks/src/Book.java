public class Book {

    //declaring variables
    private String bookTitle;
    private String author;
    private String genre;
    private int totalPages;
    private int ratingStars;

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
    //Setter for Book Title
    public void setBookTitle(String newBookTitle){
        bookTitle = newBookTitle;
    }

    //Getter for Author
    public String getAuthor(){
        return author;
    }
    //Setter for Author
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    //Getter for Genre
    public String getGenre(){
        return genre;
    }
    //Setter for Genre
    public void setGenre(String newGenre){
        genre = newGenre;
    }

    //Getter for Total Pages
    public int getTotalPages(){
        return totalPages;
    }
    //Setter for Total Pages
    public void setTotalPages(int newTotalPages){
        totalPages = newTotalPages;
    }

    //Getter for Rating Stars
    public int ratingStars(){
        return ratingStars;
    }
    //Setter for Rating Stars
    public void setRatingStars(int newRatingStars){
        ratingStars = newRatingStars;
    }





}
