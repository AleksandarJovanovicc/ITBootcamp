package com.itbootcamp.nedelja3;

import java.util.Scanner;

public class DZ03 {
    public static void main(String[] args) {
        unosImena();
        }

    public static String[] unosImena () {
        Scanner skener = new Scanner(System.in);
        int x = 1;
        String[] firtsArray = new String[x];
        String[] secondArray;
        String[] thirdArray;
        int j = 0;
        int p = 0;
        int namesCounter = 0;
        for (; true; ) {
            System.out.print("Input \"kraj\" to quit or input name: ");
            String input = skener.nextLine();
            firtsArray[p] = input;
            p++;
            j++;
            namesCounter++;
            if (firtsArray.length == j) {
                secondArray = new String[firtsArray.length * 2];
                for (int t = 0; t < firtsArray.length; t++) {
                    secondArray[t] = firtsArray[t];
                }
                firtsArray = secondArray;
            }
            if (input.equalsIgnoreCase("kraj")) {
                break;
            }
        }
        thirdArray = new String[namesCounter];
        for (int w = 0; w < (namesCounter - 1); w++) {
            thirdArray[w] = firtsArray[w];
        }
        for (int i = 0; i < (thirdArray.length - 1); i++) {
            if (i == (thirdArray.length - 2)) {
                System.out.print(thirdArray[i]);
            } else
                System.out.print(thirdArray[i] + ", ");
        }
        return thirdArray;
    }
}
