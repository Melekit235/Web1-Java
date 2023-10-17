package by.verghel.Lab1;


public class Task12 {
    public static void main(String[] args) {

        Book book1 = new Book("Masa", "Akunin", 100, 1);
        Book book2 = new Book("Harry", "Roulling", 150, 2);
        Book book3 = new Book("Masa", "Akunin", 100, 3);

        System.out.println(book1.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book3.toString());
    }
}
