package ru.mirea.lab1;

public class practice_1 {
    public static void main(String[] args){
        int[] a = {2,100,50,60,70,10,20,30,90,110};
        double sum = 0;
        for (int i = 0 ; i < a.length; i++ ){
            sum += a[i];
        }
        System.out.println("Сумма элементов целочисленного массива: "+ sum);
        double middle = sum / a.length;
        System.out.println("Среднее арифметическое элементов массива:  "+ middle);
    }
}
