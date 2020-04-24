package ru.evdokimov.task11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("c:\\Test Folder");

        File file = new File(dir,"test.txt");
        boolean createDir = dir.mkdir();
        try {
            boolean createFile = file.createNewFile();
            if (createFile)
                System.out.println("Файл создан");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        File newFile = new File(dir, "newtest.txt");
        file.renameTo(newFile);
        System.out.println("Файл переименован");
        Path origFile = Paths.get("c:\\Test Folder\\newtest.txt");
        Path copyedFile = Paths.get("c:\\Test Folder\\newtest_copy.txt");
        try {
            Files.copy(origFile, copyedFile);
            System.out.println("Файл скопирован");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
