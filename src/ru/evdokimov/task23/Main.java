package ru.evdokimov.task23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Person{
int age;
String surname;
String sex;
private int id;
Person(int age, String surname, String sex){
    this.age=age;
    this.surname=surname;
    this.sex=sex;
}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
@Override
    public String toString (){
    return "Person{" +
            "Возраст=" + age +
            ", Фамилия='" + surname + '\'' +
            ", Пол='" + sex + '\'' +
            '}';
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
                || (surname != null &&surname.equals(guest.getSurname())))
                && (sex == guest.sex
                || (sex != null && sex.equals(guest.getSex())
                && (age == guest.age)
        ));
    }
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((surname== null) ? 0 : surname.hashCode());
        result = prime * result + id;
        result = prime * result + age;
        result = prime * result +
                ((sex == null) ? 0 : sex.hashCode());
        return result;
    }
}

public class Main {
    /*public static Map<String, Person> createMap()
    {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29,"Петрова","жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }*/
    public static void removeTheDuplicates(Map<String, Person> map) {
        //Map<String, Person> copy = new HashMap<>(map);
        try {
            for (Map.Entry<String, Person> pair1 : map.entrySet()) {
                for (Map.Entry<String, Person> pair2 : map.entrySet()) {
                    if (pair1.hashCode()==pair2.hashCode()) {
                        removeItemFromMapByValue(map, pair1.getValue());
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void removeItemFromMapByValue(Map<String, Person> map, Person value)
    {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args) {
            Map<String, Person> book = new HashMap<>();
            Person person1 = new Person(29,"Петрова","жен");
            Person person2 = new Person(34, "Сидорова", "жен");
            Person person3 = new Person(34, "Тихонова", "жен");
            Person person4 = new Person(35, "Петров", "муж");
            book.put("Key1", person1);
            book.put("Key2", person1);
            book.put("Key3", person2);
            book.put("Key4", person3);
            book.put("Key5", person4);
            book.put("Key6", person4);

removeTheDuplicates(book);
System.out.println(book);
    }
}
