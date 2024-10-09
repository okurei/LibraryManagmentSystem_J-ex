import java.util.Objects;

public class Book {
    private final String name;
    private final String author;
    private final String isbn;
    private int numberOfBook = 1;

    public Book (String name, String author, String isbn){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void increaseNumberOfBook(){
        numberOfBook++;
    }
    public void decreaseNumberOfBook(){
        numberOfBook--;
    }

    public int getNumberOfBook(){
        return numberOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
