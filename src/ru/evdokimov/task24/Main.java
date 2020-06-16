package ru.evdokimov.task24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любую строку:");
        String s = scan.next();
        ArrayList<Character> list = new ArrayList();
        ArrayList<Character> newlist = new ArrayList();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        for (Character c : list) {
            if (Collections.frequency(list, c) == 1) {
                newlist.add(c);
            }
        }
        System.out.print(newlist.get(0));
    }
}