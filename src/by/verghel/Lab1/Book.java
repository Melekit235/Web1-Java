package by.verghel.Lab1;

import java.util.Comparator;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Book book = (Book) object;

        return title.equals(book.title) && author.equals(book.author) && price == book.price;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        long result = 1;

        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + price;

        return (int) (result % Integer.MAX_VALUE);
    }

    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", price=" + price + ", edition=" + edition + ", isbn=" + isbn + '}';
    }


    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.isbn = other.isbn;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Book(this);
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.isbn, o.isbn);
    }


    public static class TitleComparator implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }

    public static class TitleAuthorComparator implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            int titleComparison = book1.getTitle().compareTo(book2.getTitle());
            if (titleComparison != 0) {
                return titleComparison;
            }
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    }

    public static class AuthorTitleComparator implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
            if (authorComparison != 0) {
                return authorComparison;
            }
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }

    public static class AuthorTitlePriceComparator implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
            if (authorComparison != 0) {
                return authorComparison;
            }
            int titleComparison = book1.getTitle().compareTo(book2.getTitle());
            if (titleComparison != 0) {
                return titleComparison;
            }
            return Integer.compare(book1.getPrice(), book2.getPrice());
        }
    }
}
