package ru.evdokimov.task2;

import java.util.Random;
import java.util.Scanner;
public class Goryanoholodno {
    public static void main(String args[]) {
        Random r = new Random(); //создаем рандом r
        int x = r.nextInt (100); // присваиваем рандомом значение переменной х
        int stop=505;
        boolean isTrue = true;
        Scanner in = new Scanner (System.in);
        while (isTrue) {
            //цикл будет выполняться, пока значение true
        System.out.println("Игра Горячо-Холодно. Попробуй угадать число от 0 до 100. " +
                "Введи число, для досрочного прерывания игры введи число 505:");
        int y = in.nextInt();
        if (y==stop) break;
                if ((y<0) | (y>101)) {
            System.out.println("ведено не корректное число");

        continue; }

              int z = Math.abs(x-y);

                                       if ((z < 5) & (z > 0)) {
                    System.out.println("Очень Горячо");
                                           continue;}
                if ((z < 15) & (z > 5)) {
                    System.out.println("Горячо");
                    continue; }
                if ((z <= 25) & (z >= 15)) {
                    System.out.println("Тепло");
                    continue; }
            if (z>25) {
                System.out.println("Холодно");
                continue;  }


          isTrue = false;
        System.out.println("В точку"); }
    }

}