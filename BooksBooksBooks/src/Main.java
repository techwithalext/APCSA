public class Main {

    public static void main(String[] args) {

        Book ofMiceAndMen = new Book("Of Mice and Men", "John Steinbeck", "Novella", 123);
        Book lordOfTheFlies = new Book("Lord of the Flies", "William Golding", 456);
        Book samsungFridgeUserManual = new Book("Samsung Fridge User Manual", "Samsung", "User Manuals", 50);
        Book weaponsOfMathDestruction = new Book("Weapons of Math Destruction", "Cathy O'Neil", 321);

        System.out.println(ofMiceAndMen.bookTitle + " by " + ofMiceAndMen.author);
        System.out.println("  - Genre: " + ofMiceAndMen.genre);
        System.out.println("  - Number of Pages: " + ofMiceAndMen.totalPages);
        System.out.println("  - Ratings: " + + ofMiceAndMen.getRating() + " stars, " + ofMiceAndMen.getRating() + " stars, " + ofMiceAndMen.getRating() + " stars");
        System.out.println();

        System.out.println(lordOfTheFlies.bookTitle + " by " + lordOfTheFlies.author);
        System.out.println("  - Number of Pages: " + lordOfTheFlies.totalPages);
        System.out.println("  - Ratings: " + + lordOfTheFlies.getRating() + " stars, " + lordOfTheFlies.getRating() + " stars, " + lordOfTheFlies.getRating() + " stars");
        System.out.println();

        System.out.println(samsungFridgeUserManual.bookTitle + " by " + samsungFridgeUserManual.author);
        System.out.println("  - Genre: " + samsungFridgeUserManual.genre);
        System.out.println("  - Number of Pages: " + samsungFridgeUserManual.totalPages);
        System.out.println("  - Ratings: " + + samsungFridgeUserManual.getRating() + " stars, " + samsungFridgeUserManual.getRating() + " stars, " + samsungFridgeUserManual.getRating() + " stars");
        System.out.println();

        System.out.println(weaponsOfMathDestruction.bookTitle + " by " + weaponsOfMathDestruction.author);
        System.out.println("  - Number of Pages: " + weaponsOfMathDestruction.totalPages);
        System.out.println("  - Ratings: " + + weaponsOfMathDestruction.getRating() + " stars, " + weaponsOfMathDestruction.getRating() + " stars, " + weaponsOfMathDestruction.getRating() + " stars");
        System.out.println();


    }
}
