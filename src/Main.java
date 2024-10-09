public class Main {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.run();
    }
}

/*Exercise: Library Management System

 You are tasked with developing a Library Management System that keeps track of books available in the library.
 Each book has a title, author, and ISBN. The system should support the following functionalities:

 Add a Book: Add a new book to the library.
 Remove a Book: Remove a book using its ISBN.
 Search for a Book: Search for a book by its title.
 Display All Books: Display all the books available in the library, sorted by title.
 Check if a Book is Available: Check if a book (based on ISBN) is available in the library.
 Count the Total Number of Books: Count how many books are available in the library.

 Instructions:

 Use Java Collections (like ArrayList, HashSet, or HashMap) to store the books.
 Implement methods to perform the above functionalities.

 Class Design:

 Book Class:
 Create a class Book with attributes:
 String title
 String author
 String isbn

 Library Class:
 Use a HashMap<String, Book> where the key is the ISBN and the value is the corresponding Book object.

 Code Outline:

 java

 import java.util.*;

 class Book {
 private String title;
 private String author;
 private String isbn;

 public Book(String title, String author, String isbn) {
 this.title = title;
 this.author = author;
 this.isbn = isbn;
 }

 public String getTitle() {
 return title;
 }

 public String getAuthor() {
 return author;
 }

 public String getIsbn() {
 return isbn;
 }

 @Override
 public String toString() {
 return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
 }
 }

 class Library {
 private Map<String, Book> bookCollection;

 public Library() {
 bookCollection = new HashMap<>();
 }

 // 1. Add a book to the library
 public void addBook(Book book) {
 if (!bookCollection.containsKey(book.getIsbn())) {
 bookCollection.put(book.getIsbn(), book);
 System.out.println("Book added: " + book);
 } else {
 System.out.println("Book with ISBN " + book.getIsbn() + " already exists.");
 }
 }

 // 2. Remove a book from the library
 public void removeBook(String isbn) {
 if (bookCollection.containsKey(isbn)) {
 bookCollection.remove(isbn);
 System.out.println("Book with ISBN " + isbn + " removed.");
 } else {
 System.out.println("No book found with ISBN " + isbn);
 }
 }

 // 3. Search for a book by title
 public void searchBookByTitle(String title) {
 for (Book book : bookCollection.values()) {
 if (book.getTitle().equalsIgnoreCase(title)) {
 System.out.println("Book found: " + book);
 return;
 }
 }
 System.out.println("No book found with title: " + title);
 }

 // 4. Display all books (sorted by title)
 public void displayAllBooks() {
 List<Book> books = new ArrayList<>(bookCollection.values());
 books.sort(Comparator.comparing(Book::getTitle));

 if (books.isEmpty()) {
 System.out.println("No books available in the library.");
 } else {
 for (Book book : books) {
 System.out.println(book);
 }
 }
 }

 // 5. Check if a book is available by ISBN
 public boolean isBookAvailable(String isbn) {
 return bookCollection.containsKey(isbn);
 }

 // 6. Count total number of books
 public int countBooks() {
 return bookCollection.size();
 }
 }

 public class LibraryManagementSystem {
 public static void main(String[] args) {
 Library library = new Library();

 // Adding books
 library.addBook(new Book("Harry Potter", "J.K. Rowling", "12345"));
 library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "23456"));
 library.addBook(new Book("1984", "George Orwell", "34567"));

 // Display all books
 library.displayAllBooks();

 // Search for a book by title
 library.searchBookByTitle("The Hobbit");

 // Remove a book
 library.removeBook("23456");

 // Check if a book is available by ISBN
 System.out.println("Is '1984' available? " + library.isBookAvailable("34567"));

 // Display the total number of books
 System.out.println("Total books in the library: " + library.countBooks());
 }
 }

 Tasks:

 Implement the Book and Library classes based on the above structure.
 Test the Library Management System by adding, removing, and searching for books.
 Display all books sorted by title.
 Check if a book is available using its ISBN.

 Expected Output:

 yaml

 Book added: Title: Harry Potter, Author: J.K. Rowling, ISBN: 12345
 Book added: Title: The Hobbit, Author: J.R.R. Tolkien, ISBN: 23456
 Book added: Title: 1984, Author: George Orwell, ISBN: 34567

 Title: 1984, Author: George Orwell, ISBN: 34567
 Title: Harry Potter, Author: J.K. Rowling, ISBN: 12345
 Title: The Hobbit, Author: J.R.R. Tolkien, ISBN: 23456

 Book found: Title: The Hobbit, Author: J.R.R. Tolkien, ISBN: 23456
 Book with ISBN 23456 removed.

 Is '1984' available? true
 Total books in the library: 2

 This exercise will help you practice with HashMap, iterating over collections,
 -and performing various operations on a collection of objects in Java.*/