package ru.evdokimov.task11.FileVisitor;

import java.io.File;
import java.io.IOException;

class FileVisitor {
public static void print(){

}
    public static void visitor(File file) throws IOException {
               if (file.isDirectory()) {
                File[] newFile = file.listFiles();
                for (int i = 0; i < newFile.length; i++) {
                    System.out.println(newFile[i].getName());
                    visitor(newFile[i]);
                }
            }
        }
}


public class Main {
    public static void main(String[] args) {
        File file = new File("c:\\test\\");
        FileVisitor vf = new FileVisitor();
        try {
            vf.visitor(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}




