package com.ksr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B1 {
    public static void main(String[] args) throws IOException {
        int cycle,n;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        cycle=Integer.parseInt(bf.readLine());

        for (int i = 0; i < cycle; i++) {
            int count=0;
            n=Integer.parseInt(bf.readLine());
            String a=bf.readLine();
            for(int j=0;j<n-1;j++){
                if(!checkFor(a.charAt(j)) && checkFor(a.charAt(j+1))){
                    count++;
                    j++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean checkFor(char ch) {
        boolean responce = false;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                responce = true;
        }
        return responce;
    }
}