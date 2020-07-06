package ru.evdokimov.task27;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "Ttttt";
  //      ArrayList<Character> list = new ArrayList<>();
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (c[i] == c[j])
                    count++;
            }
        }
        System.out.print(count);
    }
}
