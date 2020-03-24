package ru.evdokimov.task1;
import java.util.Scanner;
public class Main {
          public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите стоимость 1 литра бензина:");
            double cost = in.nextDouble();//Вводим стоимость 1 литра
            System.out.println("Введите колличество заправляемых литров:");
            int volume = in.nextInt();//Вводим необходимое количество бензина
            double price = cost * volume;//Стоимость заправки
            System.out.println("При цене " + cost + " рубля за литр, стоимость " + volume + " литров бензина составит "
                    + price + " рублей");
        }
    }

  