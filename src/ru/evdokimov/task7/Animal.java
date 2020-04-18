package ru.evdokimov.task7;

interface Swim	{

    public void swim();
}
interface Run	{

    public void run();
}
interface Fly	{

    public void Fly();

    ;
}
public abstract class Animal {
    public String name;

    public abstract void getName();
}
class Duck extends Animal implements Swim, Fly{

    @Override
    public void getName() {
        System.out.println("Утка");
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать");
    }

    @Override
    public void Fly() {
        System.out.println("Я умею летать");
    }
}

class Cat extends Animal implements Run, Swim{

    @Override
    public void getName() {
        System.out.println("Кот");
    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать");
    }

    @Override
    public void run() {
        System.out.println("Я умею бегать");
    }
}
class Dog extends Animal implements Run, Swim{

    @Override
    public void getName() {
        System.out.println("Собака");
    }
    @Override
    public void swim() {
        System.out.println("Я умею плавать");
    }

    @Override
    public void run() {
        System.out.println("Я умею бегать");
    }
}
class Lion extends Animal implements Run{

    @Override
    public void getName() {
        System.out.println("Лев");
    }
    @Override
    public void run() {
        System.out.println("Я умею бегать");
    }
}
class Main{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getName();
        cat.run();
        cat.swim();
        Dog dog = new Dog();
        dog.getName();
        dog.run();
        dog.swim();
        Lion lion = new Lion();
        lion.getName();
        lion.run();
        Duck duck = new Duck();
        duck.getName();
        duck.Fly();
        duck.swim();
    }
}