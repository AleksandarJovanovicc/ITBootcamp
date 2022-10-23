package com.itbootcamp.nedelja3;

import java.util.Scanner;

public class PalindromJednaPetlja {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesite string za koji zelite da proverite da li je palindrom: ");
        String x = skener.nextLine();
        palindromDva(x);
        if (palindromDva(x) == true){
            System.out.println("Jeste palindrom!");
        } else {
            System.out.println("Nije palindrom!");
        }
    }
    public static boolean palindromDva (String x) {
        boolean jePalindrom = true;
        int counter = 0;
        for (int i = (x.length()-1); i > counter; i--, counter++){
            if (x.charAt(i)!=x.charAt(counter)) {
                jePalindrom = false;
            }
        }
        return jePalindrom;
    }


}
