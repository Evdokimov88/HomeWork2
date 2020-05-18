package ru.evdokimov.task16;

import java.util.Arrays;

public class Main {
    public static void toLeft(int [][] array,int i, int j1, int j2){
int tmp = array[i][j1];
        array[i][j1] = array[i][j2];
        array[i][j2]=tmp;

    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
        for (int i=0; i<3; i++) {
            for (int j = 1; j < 9; j++) {
                toLeft(array,i,j,j-1);
                System.out.print(" "+array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
