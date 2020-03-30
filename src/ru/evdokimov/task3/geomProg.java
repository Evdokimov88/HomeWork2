package ru.evdokimov.task3;

import java.util.Scanner;

public class geomProg {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите знаменатель прогрессии");
        int q = scan.nextInt(); //знаменатель прогрессии
        System.out.println("Введите количество элементов прогрессии ");
        int n = scan.nextInt(); //количество элементов прогрессии
        int[] b = new int[n]; //создаем массив из n элементов(переменная b т.к. в Геом прогрессии так принято
        System.out.println("Введите значение первого элемента прогрессии ");
        b[1] = scan.nextInt(); //присваиваем значение первому члену прогрессии
        int i;
        System.out.println("Геометрическая прогрессия из " + n + " чисел, с первым числом "+b[1]+", со знаменателем " + q + " равна:");
        for (i = 1; i <= n; i++) { //запускаем счетчик от 1 до n
            System.out.println(b[1]*(Math.pow(q, i-1))); //формула геометрической прогресии
        }
    }


}