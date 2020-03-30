package ru.evdokimov.task3;

public class multTable {
    public static void main(String... args) {
        int i, j;
        for (i = 1; i < 11; i++) {      //создаем цикл для первых чисел от 1 до 10
            for (j = 1; j < 11; j++) { //создаем цикл для вторых чисел от 1 до 10
                System.out.print(j * i + " "); //переумножаем числа
            }
            System.out.println(""); //после того как счетчик отработал первый круг, нужен перенос на новую строку
        }
    }
}

