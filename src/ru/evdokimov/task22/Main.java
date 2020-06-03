package ru.evdokimov.task22;

public class Main {
    static int fibIteration(int n) {
        int first = 0;
        int second = 1;
        int third = 1;
        for (int i = 0; i < n; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        return first;
    }

    public static int fibRecurs(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibRecurs(n - 1) + fibRecurs(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("С помощью рекурсии:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibRecurs(i) + " ");
        }
        System.out.println();
        System.out.println("С помощью итеррации: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(fibIteration(i) + " ");
        }

    }
}
