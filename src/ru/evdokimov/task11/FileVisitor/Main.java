package ru.evdokimov.task11.FileVisitor;

import java.io.File;
import java.io.IOException;

class FileVisitor {

    public void visitor(File file) throws IOException {

        System.out.println(file.getName());


        if (file.isDirectory()) {
            for (File newFile : file.listFiles()) {

                this.visitor(newFile);
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
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}




