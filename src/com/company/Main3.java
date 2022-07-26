package com.company;

public class Main3 {
    public static void main(String[] args) {
        int n=10;
        int x=(n*(n+1))/2;
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j>=i ; j--) {
                System.out.printf("%2d",x--);
            }
            System.out.println();
        }

    }
}
