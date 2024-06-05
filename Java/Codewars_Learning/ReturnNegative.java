package Codewars_Learning;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(5));

    }
    public static int makeNegative(final int x) {
        if(x <= 0 )
            return x;
        return x * -1;
    }
}
