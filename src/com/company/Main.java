package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=11;
        int x=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==1||j==n||(j==x||j==n-x+1)&&i<n/2+1){
                    System.out.print("M");
                }else {
                    System.out.print(" ");
                }
            }
            x++;
            System.out.println();

        }

    }
}
