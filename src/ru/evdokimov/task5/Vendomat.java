package ru.evdokimov.task5;

import java.util.Scanner;


public class Vendomat {
    int account;

    public enum Menu {
        Cappuchino("нажмите клавишу 1", 99),
        Latte("нажмите клавишу 2", 150),
        Cofee("нажмите клавишу 3", 79),
        Americano("нажмите клавишу 4", 85),
        BlackTea("нажмите клавишу 5", 50),
        GreenTea("нажмите клавишу 6", 35);

        private String description;
        public int price;

        Menu(String description, int inputPrice) {
            this.description = description;
            this.price = inputPrice;
        }

        public int getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }
    }

    Vendomat(int account) {
        this.account = account;
    }

    public void setAccount(int cash) {
        this.account = cash;
    }

    public int getAccount() {
        return account;
    }

    public static void main(String[] args) {


        System.out.println("Внесите сумму для оплаты напитка на внутренний счет автомата.");
        Scanner scan = new Scanner(System.in);
        int cashInput = scan.nextInt();
        if (cashInput >= 0) {
            Vendomat accInput = new Vendomat(cashInput);
            accInput.setAccount(cashInput);
            System.out.println("На счет внесено " + accInput.getAccount() + " рублей");
            System.out.println("Для выбора напитка");
            {
                for (Menu m : Menu.values()) {
                    System.out.println(m + ": " + m.getDescription() + ", цена: " + m.getPrice() + " рублей");
                }
            }
            Menu m[] = Menu.values();
            while (true) {
                int drinkNum = scan.nextInt();
                if ((drinkNum >= 1) & (drinkNum <= 6)) {
                    System.out.println("Выбран напиток " + m[drinkNum - 1]);
                    if (accInput.getAccount() >= m[drinkNum - 1].getPrice()) {
                        System.out.println("Напиток готовиться, сдача составит " + (accInput.getAccount() -
                                m[drinkNum - 1].getPrice()) + " рублей");
                        System.out.println("Напиток готов! \nОсторожно, горячо!!!");
                    } else if (accInput.getAccount() < m[drinkNum - 1].getPrice()) {
                        System.out.println("На счете не достаточно средств.");
                        break;
                    }

                    break;
                } else {
                    System.out.println("Выбран несуществующий напиток. \nПовторите свой выбор:");
                }
                continue;
            }
        } else {
            System.out.println("Отрицательные деньги не принимаем");

        }
    }
}




