package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int sumaDziel = 0;
        int i = 1;

        while (i <= x/2){
            if (x % i ==0){
                sumaDziel = sumaDziel +i;
            }
            i = i + 1;
        }
        if (x == sumaDziel){
            System.out.println(x + "Jest Liczba doskonala");
        }else{
            System.out.println(x + "Nie jest liczba doskonala");
        }
    }
}
