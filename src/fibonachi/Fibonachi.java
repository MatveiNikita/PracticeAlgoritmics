package fibonachi;

public class Fibonachi{
    public static void main(String[] args) {
        System.out.println(effectFib(10));

    }
    public static long effectFib(int n){
        if (n <= 1){
            return n;
        }
        long[] array = new long[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        return array[n];
    }
}
