/*
Create a new project in BlueJ, called Library. In your program, create a class called Book, that has
two private instance fields: numPages and currentPage.Then create a constructor that will initialize
those instance fields. In your main method, create two objects of the Book class, one with 245 pages,
and a current page of 15, and another object with 325 pages, and a current page of 75. Next,
use dot.notation to print out the current pages of each of those books.
 */

public class book {

    private int totalPages;
    private int currentPage;
    public book(int theTotalPages, int theCurrentPage){

        totalPages = theTotalPages;
        currentPage = theTotalPages;


    }

    public static void main(String[] args) {

    book one = new book(245, 15);
    book two = new book(325, 75);

    System.out.println(one.currentPage);
    System.out.println(two.currentPage);

    }
}
