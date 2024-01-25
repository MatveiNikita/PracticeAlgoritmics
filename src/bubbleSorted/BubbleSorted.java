package bubbleSorted;

public class BubbleSorted {
    public static void main(String[] args) {
        int [] array = {1,4,6,23,63,2,3,98,0,5,100};
        bubbleSorted(array);
        for (int i = 0; i< array.length;i++){
            System.out.print(array[i]+", ");
            if(i == array.length-1){
                System.out.println(" ");
            }
        }
    }
    public static void bubbleSorted(int [] array){
        int length = array.length;
        while (length!=0){
            int max_length = 0;
            for (int i =1; i<length; i++){
                if(array[i-1] > array[i]){
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    max_length = i;
                }
            }
            length = max_length;
        }
    }
}
