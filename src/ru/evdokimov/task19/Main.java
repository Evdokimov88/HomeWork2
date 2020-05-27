package ru.evdokimov.task19;

import java.util.*;

class Test {
    Test() {

    }

    public Set<String> removeEvenLength1(Set<String> set) {
        System.out.println("\nЧерез массив:");
        String[] array;
        array = new String[set.size()];
        array = set.toArray(array);
        String val;
        for (int i = 0; i < array.length; i++) {
            val = array[i];
            if (val.length() % 2 == 0) {

                set.remove(val);
            }
        }
        return set;
    }

    public Set<String> removeEvenLength(Set<String> set) {
        System.out.println("\nЧерез итератор");
        Iterator<String> iterator = set.iterator();
        String val;
        while (iterator.hasNext()) {
            val = iterator.next();
            if (val.length() % 2 == 0)
                iterator.remove();
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
        test.removeEvenLength1(set);
        for (String entry : set)
            System.out.print(entry + " ");

        test.removeEvenLength(set);
        for (String entry : set)
            System.out.print(entry + " ");

    }
}
