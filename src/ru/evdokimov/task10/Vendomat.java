package ru.evdokimov.task10;

import java.util.Scanner;
import org.apache.log4j.Logger;

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

    public void setAccount(int cash)
    {
        this.account = cash;
    }

    public int getAccount()
    {
        return account;
    }

    public static class Main {
private static final Logger logger = Logger.getLogger(Main.class);
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
                        logger.info("Выбран напиток " + m[drinkNum - 1]);
                        if (accInput.getAccount() >= m[drinkNum - 1].getPrice()) {
                            logger.info("Напиток готовиться, сдача составит " + (accInput.getAccount() -
                                    m[drinkNum - 1].getPrice()) + " рублей");
                            logger.info("Напиток готов! \nОсторожно, горячо!!!");
                        } else if (accInput.getAccount() < m[drinkNum - 1].getPrice()) {
                            logger.error("На счете не достаточно средств.");
                            break;
                        }

                        break;
                    } else {
                        logger.warn("Выбран несуществующий напиток.\nПовторите свой выбор");

                    }
                }
            } else {
               logger.fatal("Недопустимый ввод(вводимая сумма не может быть отрицательной)");

            }
        }
    }

}


