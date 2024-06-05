package Codewars_Learning;

public class FindNextHigherNumberWithSameBits {
    public static void main(String[] args) {
        System.out.println(nextHigher(1022));
    }

    public static int nextHigher(int n) {
        int countOnes = Integer.bitCount(n);
        int nextNumber = n + 1;
        while (Integer.bitCount(nextNumber) != countOnes) {
            nextNumber++;
        }
        return nextNumber;
    }
}
