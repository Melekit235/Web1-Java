package by.verghel.Lab1;

public class ProgrammerBook extends Book{

    private String language;
    private int level;


    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        long result = 1;

        String title = getTitle();
        String author = getAuthor();
        int price = getPrice();
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + price;

        return (int) (result % Integer.MAX_VALUE);
    }

    public boolean equals(Object object){
        if (this == object){
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) object;

        return getTitle().equals(programmerBook.getTitle()) && getAuthor().equals(programmerBook.getAuthor()) && getPrice() == programmerBook.getPrice() && language.equals(programmerBook.language) && level == programmerBook.level;
    }

    public String toString(){
        return "Book{" + "title='" + getTitle() + '\'' + ", author='" + getAuthor() + '\'' + ", price=" + getPrice() + ", edition=" + getEdition() + ", language='" + language + '\'' + ", level=" + level + '}';
    }
}
