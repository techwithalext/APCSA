public class Book {
    /*
    REQUIRED FOR APPROACHING EXPECTATIONS
        Create a program with a class called Book, that contains at least two constructors
            (things you might want to initialize in your constructor include book title, author, genre, pages, etc. - you decide!)
            - forcing to use overloaded constructor to get used to concept
        Create a class Main in which you house your main method.
        Create at least 4 different book objects, 2 using each constructor
        Give each book at least 3 ratings using an addRatings method (ratings should be between 0 and 5 stars).
            - Meaning you have to create that addRatings method yourself!
        Print out all the information for each book in a neatly formatted manner
        Add comments to your code describing what is happening
    REQUIRED FOR MEETS EXPECTATIONS
        All the stuff above, plus:
        Instead of selecting ratings, use Math.random to assign random ratings to books (still between 0 and 5)
    REQUIRED FOR EXCEEDS EXPECTATIONS
        All the stuff above, plus:
        Calculate and print the following data about your book objects:
                - The total pages in all of your books combined
                - The total number of characters (letters, symbols, and spaces) in all the book titles combined
                - The first letter of each author's name, concatenated together
                - The last letter of each book's title, concatenated together
                - The average rating of all the books' average ratings
                    - Using ONLY the addRatings method (it’s okay if the ratings randomize again I just want you to get comfortable using dot.notation)
                      you created in your Book program/class and the String methods substring and length
        Comment your new code
        Ensure your output is neatly formatted
     */

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

        public static int addRating(){
            return (int)(Math.random()*6);
        }

        //Getter
    public String getBookTitle(){
        return bookTitle;
    }
    //Setter
    public void setBookTitle(String newBookTitle){
        bookTitle = newBookTitle;
    }

    //Getter
    public String getAuthor(){
        return author;
    }
    //Setter
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    //Getter
    public String getGenre(){
        return genre;
    }
    //Setter
    public void setGenre(String newGenre){
        genre = newGenre;
    }

    //Getter
    public int getTotalPages(){
        return totalPages;
    }
    //Setter
    public void setTotalPages(int newTotalPages){
        totalPages = newTotalPages;
    }

    //Getter
    public int ratingStars(){
        return ratingStars;
    }
    //Setter
    public void setRatingStars(int newRatingStars){
        ratingStars = newRatingStars;
    }





}
