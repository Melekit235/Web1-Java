package by.verghel.Lab1;

public class Task14 {
    public static void main(String[] args) {
        Book original = new Book("Masa","Akunin", 100, 3);

        try {
            Book copy = (Book) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Copy: " + copy.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
