package ru.evdokimov.task1;

import java.util.Scanner;

public class hourinseconds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд:");
        int seconds = in.nextInt();//Количество задаваемых секунд
        float hour = (float) (seconds/3600.0);
        System.out.println(seconds + " секунд равно " + hour + " часам");
    }
}