package ru.mirea.lab1;
import java.util.Scanner;
public class practice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] m = new int [n];
        for (int i = 0 ; i < n; i++){
             System.out.println("Введите число с номером "+(i+1) + " : ");
             int b = scanner.nextInt();
             m[i] = b;
        }
        int summa = 0;
        int j = 0;
        do {
            summa += m[j];
            j++;
        } while (j < n);
        System.out.println("Сумма элементов массива (do while): "+ summa );
        j = 0;
        summa = 0;
        while (j < n) {
            summa += m[j];
            j++;
        }
        System.out.println("Сумма элементов массива (while): "+ summa );
        int mini = m[0];
        int maxi = m[0];
        for (int i = 0; i < n;i++) {
            if (mini > m[i]) mini = m[i];
            if (maxi < m[i]) maxi = m[i];
        }
        System.out.println("Максимальный элемент в массиве: "+maxi);
        System.out.println("Минимальный элемент в массиве: "+mini);


    }
}
