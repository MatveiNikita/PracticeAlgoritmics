package binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] x = new int[]{12,41452,4633,574,2,34,266,8979,5656,456,3458,989,56,4,432,67,858}; //example
        Arrays.sort(x); //it's very important
        System.out.println(binarySearch(x,2));
        System.out.println(binarySearchRecursion(x,41452,0,x.length-1));

    }
    static int binarySearch(int [] array, int element){ // The Complexity of this algorithm is O(log(N))

        int left = 0; // set left border
        int right = array.length-1; // set right border

        while (left<=right){
            int middle = (left+right) / 2; // set middle position
            int current = array[middle]; // set current position
            
            if(current == element){ // check if element is current position
                return middle; // return middle position
            } else if (current < element) { // check if element is greater than current
                left = middle + 1; //move left border
            }else{
                right = middle-1; // otherwise move right border
            }
        }return -1; // if we didn't find element
    }
    public static int binarySearchRecursion(int[] array, int target, int low, int high){ //The complexity with recursion
        if(low <= high) {
            int mid = low + (high - low) / 2;

            if (target == array[mid]) {
                return mid;
            } else if (array[mid] < target) {
                return binarySearchRecursion(array, target, mid + 1, high);
            } else {
                return binarySearchRecursion(array, target, low, high - 1);
            }
        }
        return -1;
    }
}
