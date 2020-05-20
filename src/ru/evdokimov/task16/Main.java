package ru.evdokimov.task16;

import java.util.Arrays;

public class Main {
    public static void toLeft(int [][] array){
        for (int i=0; i<3; i++) {
            for (int j =0; j <10; j++) {
            array[i][j]=array[i][j+1];
            array[i][9]=0;

                System.out.print(" "+array[i][j]+" ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        toLeft(array);

    }
}
