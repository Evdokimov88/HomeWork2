package ru.evdokimov.task16;


import java.util.Arrays;

public class Main {
    public static int[][] toLeft(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                array[i][j] = array[i][j + 1];

           }
            array[i][array[i].length-1]=0;
            //Я так и не понял, почему у меня изменилас длинна массива, в результате чего я "0" смог записать
            // вместо 10, а не в последнюю ячейку, поэтому схитрил=)))))
        }
return array;

    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        System.out.println(Arrays.deepToString(toLeft(array)));

    }
}
