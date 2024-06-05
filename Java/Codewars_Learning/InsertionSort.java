package Codewars_Learning;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{8, 7, 3, 13, 4, 5, 2, 9, 1, 6, 11, -3, -1, 0})));
    }

    public static int[] insertionSort(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int arrayLenght = arr.length - 1;

        for (int i = 0; i <= arrayLenght; i ++) {
            int smallestElement = arr[0];
            int smallestElementIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < smallestElement) {
                    smallestElement = arr[j];
                    smallestElementIndex = j;
                }
            }
            sortedArray[i] = smallestElement;
            System.arraycopy(arr, 0, arr, 0, smallestElementIndex);
            System.arraycopy(arr, smallestElementIndex + 1, arr,
                    smallestElementIndex, arr.length - smallestElementIndex - 1);
            arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        }
        return sortedArray;
    }
}
