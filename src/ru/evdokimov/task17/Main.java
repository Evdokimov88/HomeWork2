package ru.evdokimov.task17;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

abstract class PersonSuperComparator implements Comparator<Person> {

    public static Comparator<Person> AgeComporator = (person1, person2) -> Integer.compare(person1.age, person2.age);


    public static Comparator<Person> NameComparator = (person1, person2) -> CharSequence.compare(person1.name, person2.name);


}

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person(30, "Анатолий");
        person[1] = new Person(19, "Сергей");
        person[2] = new Person(34, "Елена");
        person[3] = new Person(30, "Максим");
        person[4] = new Person(56, "Светлана");
        for (Person persons : person) {
            System.out.println(persons.toString());
        }
        System.out.println("Сортировка по возрасту");
        Arrays.sort(person, PersonSuperComparator.AgeComporator);
        for (Person persons : person) {
            System.out.println(persons);

        }
        System.out.println("Сортировка по имени");
        Arrays.sort(person, PersonSuperComparator.NameComparator);
        for (Person persons : person) {
            System.out.println(persons);
        }

    }
}


