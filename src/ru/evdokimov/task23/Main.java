package ru.evdokimov.task23;

import java.util.*;

class Person {
    int age;
    String surname;
    String sex;
    private int id;

    Person(int age, String surname, String sex) {
        this.age = age;
        this.surname = surname;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Возраст=" + age +
                ", Фамилия='" + surname + '\'' +
                ", Пол='" + sex + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Person guest = (Person) obj;
        return id == guest.id
                && (surname == guest.surname
                || (surname != null && surname.equals(guest.getSurname())))
                && (sex == guest.sex
                || (sex != null && sex.equals(guest.getSex())
                && (age == guest.age)
        ));
    }

    public int hashCode() {
        int result = 1;
        result = ((surname == null) ? 0 : surname.hashCode());
        result = id;
        result = age;
        result = ((sex == null) ? 0 : sex.hashCode());
        return result;
    }
}

public class Main {
    public static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        book.put("Key7", person1);
        return book;
    }

    public static void removeTheDuplicates(Map<String, Person> map) {
        ArrayList<Person> list = new ArrayList();
        for (HashMap.Entry<String, Person> pair : map.entrySet()) {
            list.add(pair.getValue());
        }
        for (Person val : list) {
            if (Collections.frequency(list, val) > 1) {
                removeItemFromMapByValue(map, val);
            }
        }

    }

    public static void removeTheDuplicates1(Map<String, Person> map) {
        Collection<Person> list = map.values();
        for (Iterator<Person> itr = list.iterator(); itr.hasNext(); ) {
            if (Collections.frequency(list, itr.next()) > 1) {

                itr.remove();
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());

        }

    }

    public static void main(String[] args) {
        Map m = createMap();
        removeTheDuplicates1(m);
        System.out.println(m.toString());
    }
}
