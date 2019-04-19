package com.golhan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Kaç tane fibonacci sayısı görüntülemek istiyorsunuz?");

        int sayi = scn.nextInt();

        int a=0;
        int b=1;
        int c=0;

        System.out.print(a+", "+b);

        for(int i=1; i<sayi ; i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(", "+c);
        }
    }
}
