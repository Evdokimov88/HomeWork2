package ru.evdokimov.task8;

public class Main {
public static void main(String[] args){
    String byaka = "Василий сказал: Кулибяка удалась! А Анатолий сказал, что это бяка";
    String s = byaka.replaceAll ("бяка","\"вырезано цензурой\"");
    System.out.println(s);
}
}
