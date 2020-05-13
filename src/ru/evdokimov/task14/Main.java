package ru.evdokimov.task14;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("products.txt");
        Scanner scan = new Scanner(file);
        float sum = 0;
        System.out.printf("%-20s%-16s%-15s%-10s%n","Наименование","Цена","Количество","Стоимость");
        System.out.printf("============================================================%n");
        while (scan.hasNext()==true) {
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            String s3 = scan.nextLine();
            float price = Float.parseFloat(s2);
            float quantity = Float.parseFloat(s3);
            float cost = price * quantity;
            sum += cost;
            System.out.printf("%-20s%-7s%-9s%-15s%s%-10.2f%n", s1, s2, "x", s3, "=", cost);
            }
             {
            System.out.printf("============================================================%n");

           System.out.printf("%-52s%.2f","Итого:", sum);
           }

    }
}