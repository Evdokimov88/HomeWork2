package ru.evdokimov.task7;
interface Swim1{
    void crawl();
    void butterfly();
}
interface Run1{
     void jog();
     void sprint();
}
public abstract class Human implements Swim1, Run1{
String name;
public abstract void getName();
}
class Swimmer extends Human{

    @Override
    public void crawl() {
        System.out.println("Хорошо плааваю кролем");
    }

    @Override
    public void butterfly() {
        System.out.println("Неплохо плааваю баттерфляем");
    }

    @Override
    public void jog() {
        System.out.println("Трусцой бегаю для души");
    }

    @Override
    public void sprint() {
        System.out.println("Стринтер из меня так себе");
    }

    @Override
    public void getName() {
        System.out.println("Я плавец:");
    }
}
class Runner extends Human{

    @Override
    public void crawl() {
        System.out.println("По выходным плаваю кролем");
    }

    @Override
    public void butterfly() {
        System.out.println("Баттерфляем плаваю так себе");
    }

    @Override
    public void jog() {
        System.out.println("Трусцой бегаю каждый день");
    }

    @Override
    public void sprint() {
        System.out.println("Мне нет равных на коротких забегах");
    }

    @Override
    public void getName() {
        System.out.println("Я бегун:");
    }
}
class Culturist extends Human{

    @Override
    public void crawl() {
        System.out.println("Утро начинаю с заплыва кролем");
    }

    @Override
    public void butterfly() {
        System.out.println("В обед заплыв баттерфляем");
    }

    @Override
    public void jog() {
        System.out.println("Трусцой бегаю для кардио...");
    }

    @Override
    public void sprint() {
        System.out.println("Люблю спринт");
    }

    @Override
    public void getName() {
        System.out.println("Я культурист:");
    }
}
class Main1{
    public static void main(String[] args){
        Swimmer swimmer = new Swimmer();
        swimmer.getName();
        swimmer.butterfly();
        swimmer.crawl();
        swimmer.jog();
        swimmer.sprint();
        Runner runner = new Runner();
        runner.getName();
        runner.butterfly();
        runner.crawl();
        runner.jog();
        runner.sprint();
        Culturist culturist = new Culturist();
        culturist.getName();
        culturist.butterfly();
        culturist.crawl();
        culturist.jog();
        culturist.sprint();
    }
}