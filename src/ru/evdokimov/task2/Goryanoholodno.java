package ru.evdokimov.task2;

import java.util.Random;
import java.util.Scanner;

public class Goryanoholodno {
    public static void main(String args[]) {
        Random r = new Random(); //создаем рандом r
        int x = r.nextInt(100); // присваиваем рандомом значение переменной х (загадываем число)
        int stop = 505; //стоп слово=)
        boolean isTrue = true;//булевой переменной присвоил true
        Scanner in = new Scanner(System.in);
        while (isTrue) {
            //цикл будет выполняться, пока значение true
            System.out.println("Игра Горячо-Холодно. Попробуй угадать число от 0 до 100. " +
                    "Введи число, для досрочного прерывания игры введи число 505:");
            int y = in.nextInt();//считываем с консоли число
            if (y == stop) break;// если вдруг надоело играть
            if ((y < 0) | (y > 101)) {
                System.out.println("ведено не корректное число");//ну тут все понятно, нечего вводить не те значения

                continue;
            }

            int z = Math.abs(x - y); //берем модуль разницы загаданного и введенного с консоли чисел

            if ((z < 5) & (z > 0)) {
                System.out.println("Очень Горячо");
                continue;
            }
            if ((z < 15) & (z > 5)) {
                System.out.println("Горячо");
                continue;
            }
            if ((z <= 25) & (z >= 15)) {
                System.out.println("Тепло");
                continue;
            }
            if (z > 25) {
                System.out.println("Холодно");
                continue;
            }
//выше условия, при которых приложение подсказывает на сколько близко мы к загадонному числу

            isTrue = false; //присваевам false, когда число угадано
            System.out.println("В точку");
        }
    }

}