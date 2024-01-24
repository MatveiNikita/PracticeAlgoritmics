package binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] x = new int[]{12,41452,4633,574,2,34,266,8979,5656,456,3458,989,56,4,432,67,858}; //example
        Arrays.sort(x); //it's very important
        System.out.println(binarySearch(x,67));

    }
    static int binarySearch(int [] sortedArray, int element){ // The Complexity of this algorithm is O(log(N))

        int left = 0; // set left border
        int right =sortedArray.length-1; // set right border

        while (left<=right){
            int middle = (left+right) / 2; // set middle position
            int current = sortedArray[middle]; // set current position
            
            if(current == element){ // check if element is current position
                return middle; // return middle position
            } else if (current < element) { // check if element is greater than current
                left = middle + 1; //move left border
            }else{
                right = middle-1; // otherwise move right border
            }
        }return -1; // if we didn't find element
    }
}
