/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odevveri;

/**
 *
 * @author Sameet Acar
 */
public class SıralamaAlgoritmaları { 
    public static int[] bubbleSort(int[] array) {
   int[] array2 = new int[array.length];
for (int i = 0; i < array.length; i++) {
array2[i] = array[i];
}
    boolean sorted = false;
    while (!sorted) {
        sorted = true;
        for (int i = 1; i < array2.length; i++) {
            if (array2[i - 1] > array2[i]) {
                int temp = array2[i - 1];
                array2[i - 1] = array2[i];
                array2[i] = temp;
                sorted = false;
            }
        }
    }
    return array2;
}
    
    public static int[] insertionSort(int[] array) {
              int[] array2 = new int[array.length];
for (int i = 0; i < array.length; i++) {
array2[i] = array[i];
}
    for (int i = 1; i < array2.length; i++) {
        int key = array2[i];
        int j = i - 1;
        while (j >= 0 && array2[j] > key) { 
            array2[j + 1] = array2[j];
            j--;
        }
        array2[j + 1] = key;
    }
    return array2;
}

public static int[] selectionSort(int[] array) {
int[] array2 = new int[array.length];
for (int i = 0; i < array.length; i++) {
array2[i] = array[i];
}
    for (int i = 0; i < array2.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < array2.length; j++) {
             
            if (array2[j] < array2[minIndex]) {
                minIndex = j;
            }
        }
        int temp = array[i];
        array2[i] = array2[minIndex];
        array2[minIndex] = temp;
    }
    return array2;
}
}
