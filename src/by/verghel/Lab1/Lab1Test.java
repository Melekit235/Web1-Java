package by.verghel.Lab1;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;
@SuppressWarnings("all")
public class Lab1Test {

    @Test(timeout = 2000)
    public void Task1() throws Exception {
        Task1 task1 = new Task1();

        double res = task1.calculateExpression(1,1);
        boolean ok = res == 1.6089406034772686;
        assertTrue("Task1 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task2() throws Exception{
        Task2 task2 = new Task2();

        boolean res = task2.checkAffiliation(1,1);
        boolean ok = res == true;
        assertTrue("Task2 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task3() throws Exception{
        double[] tg ={-0.1425465430742778, -3.380515006246586, 0.8714479827243188};
        Task3 task3 = new Task3();

        int j = 0;
        boolean ok = true;
        for (int i = 3; i <= 7; i += 2){
            if (tg[j] != task3.tg(i)){
                ok = false;
            }
            j++;
        }

        assertTrue("Task3 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task4() throws Exception{
        Task4 task4 = new Task4();

        int[] array = {3, 6, 7, 9, 31};
        boolean[] check = {true, false, true, false, true};
        boolean ok = true;

        for (int i = 0; i < 5; i++){
            if(task4.isPrime(array[i]) != check[i]){
                ok = false;
            }
        }
        assertTrue("Task4 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task5() throws Exception{
        Task5 task5 = new Task5();

        int res = task5.findMinRemove(new int[]{6, 3, 77, 21, 45, 2, 7},Integer.MIN_VALUE, 0);
        boolean ok = res == 4;
        assertTrue("Task5 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task6() throws Exception{
        Task6 task6 = new Task6();

        int[][] res = task6.makeMatrix(new int[]{1, 2, 3, 4, 5}, 5);
        boolean ok = Arrays.deepEquals(res,new int[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}});
        assertTrue("Task6 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task7() throws Exception{
        Task7 task7 = new Task7();

        int[] res = task7.sortArray(new int[] {5,4,3,2,1}, 5);
        boolean ok = Arrays.equals(res, new int[] {1,2,3,4,5});
        assertTrue("Task7 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task8() throws Exception{
        Task8 task8 = new Task8();

        int[] res = task8.mergeArrays(new int[]{1,2,6,7,8},5, new int[]{2,3,4,5,9},5);
        boolean ok = Arrays.equals(res, new int[] {1,2,2,3,4,5,6,7,8,9});
        assertTrue("Task8 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task9() throws Exception{
        Task9 task9 = new Task9();

        int[] weight = {5, 89, 23, 34, 1};
        String[] ballColor = {"blue", "red", "black", "blue", "blue"};
        boolean ok = true;

        Basket basket = new Basket();
        for (int i = 0; i< 5; i++){
            basket.addBall(new Ball(ballColor[i],weight[i]));
        }
        if(basket.calculateWeight() != 152 || basket.countColorBalls("blue") != 3){
            ok = false;
        }

        assertTrue("Task9 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task12() throws Exception{
        boolean ok = true;

        Book book1 = new Book("Masa","Akunin", 100,1);
        Book book2 = new Book("Harry","Roulling", 150,2);
        Book book3 = new Book("Masa","Akunin", 100,3);


        if(book1.hashCode() != 883041178 ||
                book1.equals(book2) != false ||
                book1.equals(book3) != true ||
                !book3.toString().equals("Book{title='Masa', author='Akunin', price=100, edition=0, isbn=3}")
        ){
            ok = false;
        }

        assertTrue("Task12 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task13() throws Exception{
        boolean ok = true;

        ProgrammerBook book1 = new ProgrammerBook("C++","Akunin", 100,1, "en", 1);
        ProgrammerBook book2 = new ProgrammerBook("Java","Roulling", 150,2, "ru", 3);
        ProgrammerBook book3 = new ProgrammerBook("C#","Akunin", 100,3, "en", 1);


        if(book1.hashCode() != 796177722 ||
                book1.equals(book2) != false ||
                book1.equals(book3) != false ||
                !book2.toString().equals("Book{title='Java', author='Roulling', price=150, edition=0, language='ru', level=3}")
        ){
            ok = false;
        }

        assertTrue("Task13 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task14() throws Exception{
        boolean ok = true;

        Book original = new Book("Masa","Akunin", 100, 3);

        Book copy = (Book) original.clone();
        if(!original.toString().equals(copy.toString())){
            ok = false;
        }

        assertTrue("Task14 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task15() throws Exception{
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 3", "Author 3", 30, 3));
        books.add(new Book("Book 1", "Author 1", 10, 1));
        books.add(new Book("Book 2", "Author 2", 20, 2));

        String[] sortedBooks = {"Book{title='Book 1', author='Author 1', price=10, edition=0, isbn=1}",
                "Book{title='Book 2', author='Author 2', price=20, edition=0, isbn=2}",
                "Book{title='Book 3', author='Author 3', price=30, edition=0, isbn=3}"};

        Collections.sort(books);

        boolean ok = true;
        int i = 0;
        for (Book book : books) {
            if(!book.toString().equals(sortedBooks[i])){
                ok = false;
                break;
            }
            i++;
        }
        assertTrue("Task15 failed", ok);
    }

    @Test(timeout = 2000)
    public void Task16() throws Exception{
        boolean ok = true;

        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "A", 30, 3));
        books.add(new Book("A", "C", 10,2));
        books.add(new Book("B", "B", 20,1));

        int i = 0;
        String[] sortedTitle = {"Book{title='A', author='C', price=10, edition=0, isbn=2}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='C', author='A', price=30, edition=0, isbn=3}"};
        String[] sortedTitleAuthor = {"Book{title='A', author='C', price=10, edition=0, isbn=2}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='C', author='A', price=30, edition=0, isbn=3}"};
        String[] sortedAuthorTitle = {"Book{title='C', author='A', price=30, edition=0, isbn=3}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='A', author='C', price=10, edition=0, isbn=2}"};
        String[] sortedAuthorTitlePrice = {"Book{title='C', author='A', price=30, edition=0, isbn=3}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='A', author='C', price=10, edition=0, isbn=2}"};

        Collections.sort(books, new Book.TitleComparator());
        for (Book book : books) {
            if(!book.toString().equals(sortedTitle[i])){
                ok = false;
                break;
            }
            i++;
        }

        i = 0;
        Collections.sort(books, new Book.TitleAuthorComparator());
        for (Book book : books) {
            if(!book.toString().equals(sortedTitleAuthor[i])){
                ok = false;
                break;
            }
            i++;
        }

        i = 0;
        Collections.sort(books, new Book.AuthorTitleComparator());
        for (Book book : books) {
            if(!book.toString().equals(sortedAuthorTitle[i])){
                ok = false;
                break;
            }
            i++;
        }

        i = 0;
        Collections.sort(books, new Book.AuthorTitlePriceComparator());
        for (Book book : books) {
            if(!book.toString().equals(sortedAuthorTitlePrice[i])){
                ok = false;
                break;
            }
            i++;
        }

        assertTrue("Task16 failed", ok);
    }
}
