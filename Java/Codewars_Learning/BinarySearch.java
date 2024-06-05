package Codewars_Learning;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{10,20,30,40,55,58,12,17,84,91}, -1));
        int[] qwe = new int[]{10,20,30,40,55,58,12,17,84,91};
        System.out.println(qwe[4]);
    }
    public static int binarySearch(int[] array, int requaredNumber){
        int minIndex = 0;
        int hightIndex = array.length - 1;
        while (minIndex <= hightIndex){
            int midIndex = (minIndex + hightIndex) / 2;
            if(array[midIndex] == requaredNumber)
                return midIndex;
            if(array[midIndex] > requaredNumber)
                hightIndex = midIndex - 1;
            else minIndex = midIndex + 1;
        }
        return 0;
    }
}
