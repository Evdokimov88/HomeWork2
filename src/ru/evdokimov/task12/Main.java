package ru.evdokimov.task12;

import java.io.*;

class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    public String title;
    public String author;
    public String year;

    Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + ", автор " + author + ", год издания " +
                year;
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("c:\\libs");

        if (file.exists()) {
            System.out.println("Каталог c:\\libs уже имеется");
        } else {
            if (file.mkdir()) {
                System.out.print("Создан каталог с библиотекой c:\\libs");
            }

        }
        Book darkFields = new Book("Области тьмы", "Аллан Грин", "2001");
        Book duhless = new Book("Духлесс", "Сергей Минаев", "2006");
        Book hobbit = new Book("Хоббит. Туда и обратно", "Дж. Толкиен", "1937");
        FileOutputStream fos = new FileOutputStream("c:\\libs\\lib.txt");
        ObjectOutputStream outs = new ObjectOutputStream(fos);
        try {
            outs.writeObject(darkFields);
            outs.writeObject(duhless);
            outs.writeObject(hobbit);
            outs.close();
            System.out.println("Книги добавлены в библиотеку c:/libs/lib.txt");

        } catch (IOException e) {
            e.getMessage();
        }

        //Произошла запись книг в библиотеку, ниже идет считывание с библиотеки

        File file1 = new File("c:\\libs\\lib.txt");
        if (file1.exists()) {
            try {
                FileInputStream fis = new FileInputStream("c:\\libs\\lib.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Book bookRestored = (Book) ois.readObject();
                Book bookRestored1 = (Book) ois.readObject();
                Book bookRestored2 = (Book) ois.readObject();
                System.out.println("В библиотеке храняться следущие книги:");
                System.out.println(bookRestored);
                System.out.println(bookRestored1);
                System.out.println(bookRestored2);
                ois.close();
            } catch (ClassNotFoundException e) {
                e.getMessage();
            }
        } else {
            System.out.println("Библиотека пуста");
        }


    }
}
