package Codewars_Learning;

import java.util.Arrays;

public class ArraySubstraction {
    public static void main(String[] args) {
        int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] sharedArray = new int[firstArray.length + secondArray.length];
        for(int i = 0; i < firstArray.length; i++){
            sharedArray[i] = firstArray[i];
        }
        for(int i = firstArray.length, y = 0; y < secondArray.length; i++, y++){
            sharedArray[i] = secondArray[y];
        }
        System.out.println(Arrays.toString(sharedArray));



        int[] sharedArray2 = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, sharedArray2, 0, firstArray.length);
        //               srcArray,   srcStart, dstArray,     dstStart, dstEndPosition
        System.arraycopy(secondArray, 0, sharedArray2, 10, secondArray.length);
        //               srcArray,   srcStart,   dstArray,    dstStart,  dstEndPosition

        System.out.println(Arrays.toString(sharedArray2));
    }
}
