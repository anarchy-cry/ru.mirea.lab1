package ru.mirea.lab1;

public class practice_5 {
    public static long factorial(int n){
        int a=1;
        for (int i = 1;i <= n;i++) {
            a*=i;
        }
       return a;
    }
    public static void main(String[] args) {
for ( int j=1; j<=15; j++){
    System.out.println(j+"! = "+factorial(j));
}
    }
}
