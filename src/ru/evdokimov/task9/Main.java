package ru.evdokimov.task9;


import java.util.Scanner;

enum Food {
    Apple, Porridge, Carrot, Candies, Broccoli;
}

class Child {

    public static void eating(Food food) throws Exception {
        System.out.println("Сын: Спасибо, мама");
        if (food == Food.Apple || food == Food.Candies) {
            System.out.println("Вкусно, съел за обе щеки");
        } else {

            throw new Exception();

        }

    }

}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Мама предлагает сыну еду. Нажми цифру  для выбора еды: \n1 - Яблоко\n2 - Каша\n3 - Морковь" +
                "\n4 - Конфеты \n5 - Брокколи");
        Food food[] = Food.values();
        while (true) {
            int foodInp = scan.nextInt();

            if ((foodInp >= 1) && (foodInp <= 5)) {
                try {
                    Child.eating(food[foodInp - 1]);

                } catch (Exception e) {
                    System.err.println("Мама: Накормить не удалось");
                }

            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }


}

