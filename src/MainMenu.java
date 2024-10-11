import java.util.Scanner;

public class MainMenu {

    Scanner scan = new Scanner(System.in);
    Library library = new Library();


    public void mainMenu(){
        System.out.println("Select: ");
        System.out.println("1 to add a new book");
        System.out.println("2 to remove a book");
        System.out.println("3 to search for a book by title");
        System.out.println("4 to search for the number of copy by ISBN");
        System.out.println("5 to display all the book in the library");
        System.out.println("6 to count the total number of book");
        System.out.println("7 to exit");
        String selection = scan.nextLine();
        switch (selection){
            case "1" -> library.addBook();
            case "2" -> library.removeBook(library.getInfo("ISBN of the book"));
            case "3" -> library.searchBookByName(library.getInfo("Title of the book"));
            case "4" -> library.checkAvailability(library.getInfo("ISBN of the book"));
            case "5" -> library.printLibrary();
            case "6" -> System.out.println("There are " + library.getBookCount() + " book available");
            case "7" -> System.exit(0);
            default -> mainMenu();
        }
    }
}
