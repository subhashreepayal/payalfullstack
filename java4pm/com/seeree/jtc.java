package com.seeree;

import java.util.Scanner;

public class jtc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array:  ");
        int a[][]= new int[2][2];
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        int a[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Matrix: ");
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        System.out.println(a[i][j]);
                    }
                }
     
     }
}
