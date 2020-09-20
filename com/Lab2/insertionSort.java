package com.Lab2;

/**
 * Insertion sort implementation. Sort method sorts the array in ascending order. User defines the length of the array.
 * Author: Dalvie Benu
 * Date: 2020-09-16
 */

public class insertionSort {

    insertionSort () {}
    private static int swapCounter = 0; // Keep track of # of swaps. Global as to avoid reset with multiple calls to swap.

    private static void swap( int[] array, int index1, int index2) {
        // swap the elements in array[index1] with array[index2]. Helper Function.
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        swapCounter++;

//        System.out.printf("swapping [%d] and [%d]\tswap number: %d\n", array[index1], array[index2], swapCounter);
//        printToScreen(array);
    }

    private static void printToScreen(int[] array) {
        // print array method.
        int i; // used in loop.
        for (i = 0; i < array.length; i++) {
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();
    }

    public static void inversions(int[] array) {
        // pairs of elements that are out of order.

        int inversions = 0;
        int i, j;

        for(i = 1; i < array.length; i++){
            for(j = i - 1; j >= 0 ; j--) {
                if ( array[i] < array[j]){
                    System.out.printf("\n[%d,%d], [%d,%d];", i, array[i], j, array[j]);
                    inversions++;
                }
            }
        }

        System.out.printf("\nnumber of inversions: %d\n", inversions);
    }

    public static void sort(int[] array) {
        // Two loops iterate through the array and sort the integers by comparing it to the elements behind it.
        int i, j; // used in loops.
        int length = array.length;
        for(i = 0; i < length; i++){
            for(j = i; j > 0 ; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array,  j, j - 1);
                }
                else {
                    break;
                }
            }
        }
    }

}
