package ru.kfc.autotests;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        for (int i=0; i<mass.length; i++){
            int number = new Random().nextInt(20);
            mass[i] = number;
        }
        System.out.println("Все элементы массива: ");
        System.out.println(Arrays.toString(mass));

        int max = 0;
        for (int i=0; i<mass.length; i++){
            if(max <= mass[i]){
                max = mass[i];
            }
        }
        System.out.println("Наибольший элемент массива = " + max);

        int sum = 0;
        for (int i=0; i<mass.length; i++){
            sum = sum + mass[i];
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}