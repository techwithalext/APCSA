public class Main {

    public static void main(String[] args) {

        //first book object with the second constructor
        Book ofMiceAndMen = new Book("Of Mice and Men", "John Steinbeck", "Novella", 123);
        //second book object with the first constructor
        Book lordOfTheFlies = new Book("Lord of the Flies", "William Golding", 456);
        //third book object with the second constructor
        Book samsungFridgeUserManual = new Book("Samsung Fridge User Manual", "Samsung", "User Manuals", 50);
        //fourth book object with the first constructor
        Book weaponsOfMathDestruction = new Book("Weapons of Math Destruction", "Cathy O'Neil", 321);

        //adding together the total pages of all books
        int totalPages = ofMiceAndMen.totalPages + lordOfTheFlies.totalPages + samsungFridgeUserManual.totalPages + weaponsOfMathDestruction.totalPages;
        //adding together the length of the book title for all books
        int totalTitleChars = ofMiceAndMen.bookTitle.length() + lordOfTheFlies.bookTitle.length() + samsungFridgeUserManual.bookTitle.length() + weaponsOfMathDestruction.bookTitle.length();
        //adding together the first letter of each author's name with substring
        String firstLetterAuthorName = ofMiceAndMen.author.substring(0, 1) + lordOfTheFlies.author.substring(0, 1) + samsungFridgeUserManual.author.substring(0, 1) + weaponsOfMathDestruction.author.substring(0, 1);
        //adding together the last letter of each book with the substring and using the book title's length
        String lastLetterBookTitle = ofMiceAndMen.bookTitle.substring(ofMiceAndMen.bookTitle.length() - 1) + lordOfTheFlies.bookTitle.substring(lordOfTheFlies.bookTitle.length() - 1) + samsungFridgeUserManual.bookTitle.substring(samsungFridgeUserManual.bookTitle.length() - 1) + weaponsOfMathDestruction.bookTitle.substring(weaponsOfMathDestruction.bookTitle.length() - 1);

        //integer array with ratings 3 of all books
        int ratings[] = {ofMiceAndMen.addRating(), ofMiceAndMen.addRating(), ofMiceAndMen.addRating(), lordOfTheFlies.addRating(), lordOfTheFlies.addRating(), lordOfTheFlies.addRating(), samsungFridgeUserManual.addRating(), samsungFridgeUserManual.addRating(), samsungFridgeUserManual.addRating(), weaponsOfMathDestruction.addRating(), weaponsOfMathDestruction.addRating(), weaponsOfMathDestruction.addRating()};
        //double array with the average rating for all books
        double ratingAverages[] = {((ratings[0] + ratings[1] + ratings[2])/3.0), ((ratings[3] + ratings[4] + ratings[5])/3.0), ((ratings[6] + ratings[7] + ratings[8])/3.0), ((ratings[9] + ratings[10] + ratings[11])/3.0)};
        //double value with the average rating of all books
        double ratingAverageAll = (ratingAverages[0] + ratingAverages[1] + ratingAverages[2] + ratingAverages[3])/4;

        System.out.println(ofMiceAndMen.bookTitle + " by " + ofMiceAndMen.author);
        System.out.println("  - Genre: " + ofMiceAndMen.genre);
        System.out.println("  - Number of Pages: " + ofMiceAndMen.totalPages);
        System.out.println("  - Ratings: " + ratings[0] + " stars, " + ratings[1] + " stars, " + ratings[2] + " stars");
        //printing out the average rating but only to two decimal places
        System.out.printf("  - Average Rating: %.2f stars\n", ratingAverages[0]);
        System.out.println();

        System.out.println(lordOfTheFlies.bookTitle + " by " + lordOfTheFlies.author);
        System.out.println("  - Number of Pages: " + lordOfTheFlies.totalPages);
        System.out.println("  - Ratings: " + ratings[3] + " stars, " + ratings[4] + " stars, " + ratings[5] + " stars");
        System.out.printf("  - Average Rating: %.2f stars\n", ratingAverages[1]);
        System.out.println();

        System.out.println(samsungFridgeUserManual.bookTitle + " by " + samsungFridgeUserManual.author);
        System.out.println("  - Genre: " + samsungFridgeUserManual.genre);
        System.out.println("  - Number of Pages: " + samsungFridgeUserManual.totalPages);
        System.out.println("  - Ratings: " + ratings[6] + " stars, " + ratings[7] + " stars, " + ratings[8]  + " stars");
        //printing out the average rating but only to two decimal places
        System.out.printf("  - Average Rating: %.2f stars\n", ratingAverages[2]);
        System.out.println();

        System.out.println(weaponsOfMathDestruction.bookTitle + " by " + weaponsOfMathDestruction.author);
        System.out.println("  - Number of Pages: " + weaponsOfMathDestruction.totalPages);
        System.out.println("  - Ratings: " + ratings[9] + " stars, " + ratings[10] + " stars, " + ratings[11] + " stars");
        //printing out the average rating but only to two decimal places
        System.out.printf("  - Average Rating: %.2f stars\n", ratingAverages[3]);
        System.out.println();

        System.out.println("- Total Pages: " + totalPages);
        System.out.println("- Total Title Characters: " + totalTitleChars);
        System.out.println("- First Letters of Author's Names: " + firstLetterAuthorName);
        System.out.println("- Last Letters of Book Titles: " + lastLetterBookTitle);
        //printing out the average rating but only to two decimal places
        System.out.printf("- Average Rating of all books: %.2f stars\n", ratingAverageAll);




    }
}
