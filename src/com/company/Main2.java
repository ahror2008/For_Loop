package com.company;

public class Main2 {
    public static void main(String[] args) {
        int n=20;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==1||j==n||i>=n){
                    System.out.print("U");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
