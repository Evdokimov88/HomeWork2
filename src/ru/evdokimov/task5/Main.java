package ru.evdokimov.task5;

import java.util.Arrays;
import java.util.Scanner;

class Vendomat{
    int account;
    int cashChange;
}

class Person{
int money;

}
enum Menu{
    Сoffee("1"), Capuchino("2"), Americano("3"), latte("4"), BreenTea("5"), BlackTea("6");
    private String drink;
    Menu(String drink){
        this.drink=drink;}

    public String getDrink() {
        return drink;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Выбирите напиток");
        Scanner drinkNum = new Scanner(System.in);
        System.out.println(Menu..getDrink);
    }



}
