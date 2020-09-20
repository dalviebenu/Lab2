package com.Lab2;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class task {



    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(System.nanoTime());
        DecimalFormat format = new DecimalFormat("#.##");
//        int length =  Integer.parseInt(sc.nextLine());
//        int array[] = new int[length];

        int length = Integer.parseInt(args[0]);
        int maxVal = Integer.parseInt(args[1]);
        int[] array = new int[length];

        for(int i = 0; i < length; i++){
//            array[i] = Integer.parseInt(sc.nextLine()); // .readLine returns String. Converted to int.
            array[i] = rand.nextInt(maxVal);
        }

//        insertionSort.inversions(array);
//        System.out.println();
        double timeStartInsertion = System.nanoTime();
        insertionSort.sort(array);
        double timeEndInsertion = System.nanoTime() - timeStartInsertion;

        double timeStartMerge = System.nanoTime();
        mergeSort.sort(array);
        double timeEndMerge = System.nanoTime() - timeStartMerge;

        System.out.printf("Execution time for array of size %d:\nInsertion Sort:\t%s ms\nMerge Sort:\t%s ms\n", length,
                format.format(timeEndInsertion / 1000000),  format.format(timeEndMerge / 1000000));
    }

}
