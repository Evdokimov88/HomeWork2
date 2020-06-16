package ru.evdokimov.task25;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void palindrom(String s){
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> reversList = new ArrayList<>();
        char[] c = s.toCharArray();
        for (int i=0; i<s.length(); i++)
            list.add(c[i]);
        for (int i=s.length()-1; i>=0; i--)
            reversList.add(c[i]);
        if (list.equals(reversList))
            System.out.print("Это палиндром");
        else
            System.out.print("Это не палиндром");
    }
   public static void isPalindrom(String s) {
       StringBuffer reverse = new StringBuffer(s).reverse();
       String strRev = reverse.toString();
       if (s.equalsIgnoreCase(strRev))
           System.out.print("Это палиндром");
       else
           System.out.print("Это не палиндром");
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число или строку:");
        String s = scan.next();
        isPalindrom(s);
    }
}
