package com.itbootcamp.nedelja3;

import java.util.Scanner;

public class DZ001 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesite broj ciji faktorijel zelite da izracunate: ");
        int x = skener.nextInt();
        faktorijel(x);
    }
    public static int faktorijel (int x){
        int factor = 1;
        for (int i = x; i > 0; i--){
           factor *= i;
        }
        System.out.println("Faktorijel broja " + x + " je " + factor + ".");
        return factor;
    }
}
