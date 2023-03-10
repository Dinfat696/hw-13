import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;


    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;


    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public String toString() {
        return "Книга " + this.getBookName() + " создана в " + this.getPublishingYear();
    }
    /*public boolean equals(Object year){
        Book otherBook=(Book) year;
        return this.publishingYear==otherBook.publishingYear;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishingYear);
    }
}


