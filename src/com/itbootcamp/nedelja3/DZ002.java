package com.itbootcamp.nedelja3;

import java.util.Scanner;

public class DZ002 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesite prvi string: ");
        String a = skener.nextLine();
        System.out.print("Unesite drugi string: ");
        String b = skener.nextLine();
        proveraStringa(a, b);
    }
    public static void proveraStringa (String a, String b) {
        if (a.trim().length()==b.trim().length()) {
            System.out.println("Stringovi su iste duzine!");
            System.out.print("Samoglasnici su: ");
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'u' || a.charAt(i) == 'o') {
                    System.out.print(" " + a.charAt(i));
                }
            }
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'u' || b.charAt(i) == 'o') {
                    System.out.print(" " + b.charAt(i));
                }
            }
        }
            else {
                    System.out.println("Stringovi nisu iste duzine!");
                }

    }
}
