package ru.evdokimov.task1;
import java.util.Scanner;
public class Salaryclean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ЗП сотрудника до вычета НДФЛ:");
        double salary = in.nextDouble(); //Зарплата до вычета НДФЛ//
        double salary_clean = salary - ((salary / 100) * 13);
        System.out.println("При ЗП в " + salary + " рублей, после вычета НДФЛ сотрудник получит "
                + salary_clean + " рублей \"на руки\"");
    }
}