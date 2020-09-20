package com.Lab2;

import java.util.Arrays;

public class mergeSort {

    private static int CUTOFF = 30;

    mergeSort() { }
    private static void merge (int a[], int aux[], int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];


        for (int k = lo; k <= hi; k++) {
            if (i > mid)    a[k] = aux[j++];
            else if (j > hi)    a[k] = aux[i++];
            else if (aux[i] > aux[j])   a[k] = aux[j++];
            else    a[k] = aux[i++];
        }

    }

    private static void sort (int a[], int aux[], int lo, int hi) {
        if (hi <= lo + CUTOFF - 1) {
            insertionSort.sort(Arrays.copyOfRange(a, lo, hi));
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort (int arr[]) {
        int [] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);

//        for (int k = 0; k < arr.length; k++)
//            System.out.printf("[%d]", arr[k]);

//        System.out.println("\n");
    }
}
