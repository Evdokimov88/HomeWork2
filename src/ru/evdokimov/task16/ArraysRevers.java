package ru.evdokimov.task16;

import java.util.Arrays;

public class ArraysRevers {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Создали массив целых чисел:");
        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]+" ");


        }
       System.out.println("Тот же массив в обратном порядке:");
        for (int i=array.length-1, j=0; i>=array.length/2; i--,j++){
            int tmp = array[j];
            array[j]=array[i];
            array[i]=tmp;
            System.out.print(array[i]+" ");
        }
      /*  for (int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }*/
    }
}
