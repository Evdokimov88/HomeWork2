package ru.evdokimov.task20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Test {
    public boolean isUnique(Map<String, String> map) {
        ArrayList<String> val = new ArrayList<>(map.values());
        for (int i = 0; i < val.size(); i++) {
            for (int j = i + 1; j < val.size(); j++) {
                if (val.get(i).equals(val.get(j)))
                    return false;
            }
        }
        return true;

    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Hello", "World");
        map.put("Hi", "World1");
        map.put("Vitali", "Petrov");
        map.put("Pavel", "Ivanov");
        map.put("Ivan", "Kulikov");
        Test test = new Test();
        System.out.print(test.isUnique(map));

    }
}

