package sandbox;

public class ReversArray {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        for(int i = array.length-1; i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
