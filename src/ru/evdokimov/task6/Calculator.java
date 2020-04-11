package ru.evdokimov.task6;

import java.util.Scanner;

public class Calculator {
    double vr1;
    double vr2;
    Calculator (double vr1, double vr2){
        this.vr1=vr1;
        this.vr2=vr2;
    }

    public static void summa(double vr1, double vr2) {
        double summa = vr1 + vr2;
        System.out.println(vr1 + " + " + vr2 + " = " + summa);
    }
    public static void raznost (double vr1, double vr2){
            double raznost = vr1 - vr2;
            System.out.println(vr1+" - "+vr2+" = "+raznost);

        }

    public static void proizved (double vr1, double vr2){
        double proizved = vr1*vr2;
        System.out.println(vr1+" * "+vr2+" = "+proizved);

    }
    public static void percent (double vr1, double vr2){
        double percent = (vr1/100)*(Math.abs(vr2));
        System.out.println(Math.abs(vr2)+" процентов от "+vr1+" = "+percent);

    }

    public static void delenie (double vr1, double vr2){
        double delenie = vr1/vr2;
        System.out.println(vr1+" / "+vr2+" = "+delenie);

    }
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double vr1= vvod.nextDouble();
        System.out.println("Введите второе число:");
        double vr2= vvod.nextDouble();
        summa(vr1,vr2);
        raznost(vr1,vr2);
        proizved(vr1,vr2);
        delenie(vr1, vr2);
        percent(vr1,vr2);
    }
}
