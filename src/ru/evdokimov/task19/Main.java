package ru.evdokimov.task19;

import java.util.*;

class Test {
    Test() {

    }

   /* public Set<String> removeEvenLength1(Set<String> set) {
        String[] array;
        array = new String[set.size()];
        array = set.toArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            char[] chars = new char[array[i].length()];
            for (int j = 0; j < array[i].length(); j++) {
                chars = array[i].toCharArray();
            }

            if (chars.length % 2 != 0) {
                System.out.print(chars);
                System.out.print(" ");

            }
        }

        return set;
    }*/
    public Set<String> removeEvenLength(Set<String> set) {

        Iterator<String> iterator = set.iterator();

        char[] chars = new char[iterator.next().length()];
        while (iterator.hasNext()) {
            chars = iterator.next().toCharArray();

            if (chars.length % 2 != 0) {
                System.out.println(String.valueOf(chars));
            }
        }
        if (chars.length % 2 == 0) {
            set.remove(String.valueOf(chars));

        }




        return set;
    }


}

public class Main {


    public static void main(String[] args) {
        Set<String> set = new TreeSet();
        set.add("Hello");
        set.add("Good");
        set.add("May");
        set.add("hi");
        set.add("Привет");
        set.add("Glass");
        set.add("!");
        set.add("Java");
        for (String entry : set)
            System.out.print(entry + " ");
        Test test = new Test();
       // test.removeEvenLength1(set);
        test.removeEvenLength(set);
        for (String entry : set)
            System.out.print(entry + " ");


    }
}
