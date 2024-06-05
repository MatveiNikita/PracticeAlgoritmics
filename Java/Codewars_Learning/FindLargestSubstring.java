package Codewars_Learning;


public class FindLargestSubstring {
    public static void main(String[] args) {
        System.out.println(largestSubstring("abgfdcccabdwq"));
    }
    public static String largestSubstring(String str) {
        String result = "";
        for (int right = 0; right < str.length(); right++) {
            for (int left = 1; left < str.length(); left++) {
                if (str.charAt(right) == str.charAt(left) || str.charAt(left -1) == str.charAt(left)
                        || left == str.length() - 1)
                    if (result.length() < left - right) {
                        result = str.substring(right, left);
                        right = left;
                    }
                else right = left;
            }
        }
        return result;
    }
}
