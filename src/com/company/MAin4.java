package com.company;

public class MAin4 {
    public static void main(String[] args) {
        int a=20;
        for (int i = 2; i <=a ; i++) {
            for (int j = 2; j <=a ; j++) {
                if ((j==i|j==a-i+1)&&i<=a/2+1||(j==a/2+1&&i>a/2)){
                    System.out.print("Y");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    
    }
}
