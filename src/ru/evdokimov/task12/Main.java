package ru.evdokimov.task12;

import java.io.*;
import java.util.Arrays;

class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    public static String title;
    public static String author;
    public static String year;

    Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void setTitle(String title) {
        Book.title = title;
    }

    public static String getTitle() {
        return title;
    }


    public static String getAuthor() {
        return author;
    }

    public static String getYear() {
        return year;
    }


    /* public static void print() {
        System.out.println("Название: " + Arrays.toString(getTitle()) + ", Автор: " + Arrays.toString(getAuthor()) +
                    ", Год издания: " + Arrays.toString(getYear()));

    }*/

}


public class Main {
    public static void main(String[] args) throws IOException {

       /* String[] title = {"Хоббит. Туда и обратно", "Области тьмы", "Духлесс"};
        String[] author = {"Дж. Толкиен", "Алан Глинн", "Сергей Минаев"};
        String[] year = {"1937", "2001", "2006"};
        Book books = new Book("Хоббит. Туда и обратно","Дж. Толкиен","1937");
        FileOutputStream fos = new FileOutputStream("lib.txt");
        ObjectOutputStream outs = new ObjectOutputStream(fos);
        try {
            outs.writeObject(books);
            outs.close();

        } catch (IOException e) {
            e.getMessage();
        }*/
       try {
            FileInputStream fis = new FileInputStream("lib.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Book lib = (Book) ois.readObject();
            System.out.println("В Библиотеке имеются книги: ");
            System.out.println(lib.getTitle());

        } catch (ClassNotFoundException e) {
            e.getMessage();
        }

    }
}
