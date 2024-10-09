import java.util.*;

public class Library {
    private int bookCount = 0;

    Scanner scan = new Scanner(System.in);
    LinkedList<Book> booksList = new LinkedList<>();
    HashMap<String, Book> booksMap = new HashMap<>();

    public void addBook(){
       String name = getInfo("Insert the name of the book: ");
       String author = getInfo("Insert the author of the book: ");
       String isbn = getInfo("Insert the isbn of the book: ");
       if (booksMap.containsKey(isbn)){
           booksMap.get(isbn).increaseNumberOfBook();
       }else{
           Book book = new Book(name, author, isbn);
           booksMap.put(isbn, book);
           insertBookInOrder(book);
       }
       bookCount++;

    }
    public void insertBookInOrder(Book book){
        int i = 0;
        while(i < booksList.size() && booksList.get(i).getName().compareTo(book.getName()) < 0){i++;}
        booksList.add(i, book);
    }

    public void removeBook(String info){
       Book book = booksMap.getOrDefault(info, null);
       if (book != null && book.getNumberOfBook() > 0){
           book.decreaseNumberOfBook();
           System.out.println("Book removed successfully");
           bookCount--;
       }else{
           System.out.println("Book not present");
       }
    }
    public void searchBookByName(String info){
        for (Book book : booksList){
            if (book.getName().compareTo(info) == 0){
                System.out.println(book);
                break;
            }else{
                System.out.println("Book not found");
            }
        }

    }
    public void printLibrary(){
        System.out.println(booksList.toString());
    }

    public void checkAvailability(String info){
        if (booksMap.containsKey(info)){
            System.out.println(booksMap.get(info).getNumberOfBook() + " copy available" );
        }else{
            System.out.println("Book not available");
        }

    }

    public int getBookCount(){return bookCount;}

    public String getInfo(String question){
        System.out.printf(question);
        return scan.next();
    }

    public void addBookForTest(String name, String author, String isbn){
        Book book = new Book(name, author, isbn);
        booksMap.put(isbn, book);
        insertBookInOrder(book);
        bookCount++;
    }
}
