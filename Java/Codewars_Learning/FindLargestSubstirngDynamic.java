package Codewars_Learning;


public class FindLargestSubstirngDynamic {
    public static void main(String[] args) {
        String wordA = "hish";
        String wordB = "fish";
        int[][] result = findLargestSubstring(wordA, wordB);

        System.out.println("  " + wordA);
        char[] charWordB = wordB.toCharArray();
        int lenght = (charWordB.length + wordA.length()) / 2;

        for (int i = 0; i < lenght; i++) {
            System.out.print(charWordB[i] + " ");
            for (int j = 0; j < lenght; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] findLargestSubstring(String a, String b) {
        int[][] result = new int[a.length()][b.length()];
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        int matchCount = 1;
        int lenght = (charA.length + charB.length) / 2;

        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                if (charB[i] == charA[j]) {
                    result[i][j] = matchCount;
                    matchCount ++;
                }
                else
                    result[i][j] = 0;
            }
        }
        return result;
    }
}
