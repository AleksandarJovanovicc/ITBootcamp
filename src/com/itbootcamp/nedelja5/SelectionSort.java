package com.itbootcamp.nedelja5;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] niz = {44, 2, 13, 233, 1};
        System.out.println(Arrays.toString(niz));
        selectionSort(niz);
        System.out.println(Arrays.toString(niz));
    }

    public static void selectionSort (int[] niz){
        for (int i = 0; i < niz.length-1; i++) {
            int min = niz[i];
            for (int j = i; j < niz.length; j++) {
                if (niz[j] < min) {
                    min = niz[j];
                    niz[j] = niz[i];
                    niz [i] = min;
                }
            }
        }
    }
}
