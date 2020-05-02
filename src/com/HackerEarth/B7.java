package com.HackerEarth;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t; i++) {
            int price1=0;
            int price2=0;
            int cost[]=new int[2];
            for (int j = 0; j < 2; j++) {
                cost[j]=s.nextInt();
            }
            int n=s.nextInt();
            int[][] result =new int[n][2];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2; k++) {
                    result[j][k]=s.nextInt();
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2; k++) {
                    if(k==0)
                        if(result[j][k]==1)
                            price1++;
                     if(k==1)
                         if(result[j][k]==1)
                             price2++;
                    }
                }
            int res=0;
            if(i%2==0) {
                res=price1*cost[0]+price2*cost[1];
            }
            if(i%2==1) {
                res=price1*cost[1]+price2*cost[0];
            }
            System.out.println(res);
        }
        }
    }
