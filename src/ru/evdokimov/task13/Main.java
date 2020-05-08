package ru.evdokimov.task13;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args){
        //Запишем строку в файл в кодировке UTF-8
        try {
            String s = "С праздником Великой Победы!";
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\test\\test.txt"),
                    StandardCharsets.UTF_8));

            bw.write(s);
            bw.close();

        }
        catch (IOException e) {
            e.getMessage();
        }
        //Считаем строки из файла и запишем в другой файл с другой кодировкой
        try {
            FileReader reader = new FileReader("C:\\test\\test.txt");
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\test\\new_test.txt"),
                    Charset.forName("Windows-1251")));
            while (reader.ready()) {
                int data = reader.read();
                bw1.write(data);
            }
            bw1.close();
            reader.close();
        } catch (IOException e) {
            e.getMessage();
        }

    }
}

