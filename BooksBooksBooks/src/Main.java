public class Main {

    public static void main(String[] args) {

        Book ofMiceAndMen = new Book("Of Mice and Men", "John Steinbeck", "Novella", 123);
        Book lordOfTheFlies = new Book("Lord of the Flies", "William Golding", 456);
        Book samsungFridgeUserManual = new Book("Samsung Fridge User Manual", "Samsung", "User Manuals", 50);
        Book weaponsOfMathDestruction = new Book("Weapons of Math Destruction", "Cathy O'Neil", 321);

        int totalPages = ofMiceAndMen.totalPages + lordOfTheFlies.totalPages + samsungFridgeUserManual.totalPages + weaponsOfMathDestruction.totalPages;
        int totalTitleChars = ofMiceAndMen.bookTitle.length() + lordOfTheFlies.bookTitle.length() + samsungFridgeUserManual.bookTitle.length() + weaponsOfMathDestruction.bookTitle.length();
        String firstLetterAuthorName = ofMiceAndMen.author.substring(0, 1) + lordOfTheFlies.author.substring(0, 1) + samsungFridgeUserManual.author.substring(0, 1) + weaponsOfMathDestruction.author.substring(0, 1);
        String lastLetterBookTitle = ofMiceAndMen.bookTitle.substring(ofMiceAndMen.bookTitle.length() - 1) + lordOfTheFlies.bookTitle.substring(lordOfTheFlies.bookTitle.length() - 1) + samsungFridgeUserManual.bookTitle.substring(samsungFridgeUserManual.bookTitle.length() - 1) + weaponsOfMathDestruction.bookTitle.substring(weaponsOfMathDestruction.bookTitle.length() - 1);



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

        System.out.println("Total Pages: " + totalPages);
        System.out.println("Total Title Characters: " + totalTitleChars);
        System.out.println("First Letters of Author's Names: " + firstLetterAuthorName);
        System.out.println("Last Letters of Book Titles: " + lastLetterBookTitle);



    }
}
