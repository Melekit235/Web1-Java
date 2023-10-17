package by.verghel.Lab1;

public class Task13 {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("Masa", "Akunin", 100, 1, "en", 1);
        ProgrammerBook book2 = new ProgrammerBook("Harry", "Roulling", 150, 2, "ru", 3);
        ProgrammerBook book3 = new ProgrammerBook("Masa", "Akunin", 100, 3, "en", 1);

        System.out.println(book1.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book2.toString());
    }
}
