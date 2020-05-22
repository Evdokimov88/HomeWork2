package ru.evdokimov.task11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = new File("c:\\Test Folder");

        File file = new File(dir,"test.txt");
        try {
            boolean createDir = dir.mkdir();
            if (createDir)
                System.out.println("Каталог создан");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            boolean createFile = file.createNewFile();
            if (createFile)
                System.out.println("Файл создан");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        File newFile = new File(dir, "renamed_test.txt");
        try {
            boolean renamed = file.renameTo(newFile);
            if(renamed)
            System.out.println("Файл переименован");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Path origFile = Paths.get("c:\\Test Folder\\renamed_test.txt");
        Path copyedFile = Paths.get("c:\\Test Folder\\test_copy.txt");
        try {
            Files.copy(origFile, copyedFile);
            System.out.println("Файл скопирован");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
        boolean deleted = Files.deleteIfExists(copyedFile);
        if(deleted)
            System.out.println("File deleted");
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

}
