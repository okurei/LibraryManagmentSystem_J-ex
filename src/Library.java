import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(){
       String name = getInfo("Insert the name of the book: ");
       String author = getInfo("Insert the author of the book: ");
       String isbn = getInfo("Insert the isbn of the book: ");
    };
    public void removeBook(){};
    public void searchBook(){
        String title = getInfo("Insert the title: ");
    }
    public void printLibrary(){
        System.out.println(books.toString());
    }
    public void countBook(){}

    public String getInfo(String question){
        System.out.println(question);
        return scan.next();
    }
}
