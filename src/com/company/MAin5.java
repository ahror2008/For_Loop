package com.company;

public class MAin5 {
    public static void main(String[] args) {
        int n = 10;
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || j == n || (i == j && i <= n / 2 && j < n / 2) || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
