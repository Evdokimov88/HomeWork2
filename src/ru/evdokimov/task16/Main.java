package ru.evdokimov.task16;


public class Main {
    public static void toLeft(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                array[i][j] = array[i][j + 1];


                System.out.print(" " + array[i][j] + " ");

            }
            System.out.println(0);
        }


    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        toLeft(array);

    }
}
