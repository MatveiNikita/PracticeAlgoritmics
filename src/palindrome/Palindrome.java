package palindrome;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String text = "mamam";
        System.out.println(palindrome(text));
        System.out.println(palindromeRecurs(text));
    }
    public static boolean palindromeRecurs(String string){
        if(string.isEmpty() || string.length() == 1){
            return true;
        }
        if(string.charAt(string.length()-1) == string.charAt(0)){
            return palindrome(string.substring(1,string.length()-1));
        }
        return false;
    }
    public static boolean palindrome(String string){
        string = string.toLowerCase(Locale.ROOT);
        StringBuilder stringRevers = new StringBuilder();
        char[] stringArray = string.toCharArray();
        for (int i = stringArray.length-1; i>=0 ;i--) {
                stringRevers.append(stringArray[i]);
        }
        if(stringRevers.toString().equals(string)){
            return true;
        }else
            return false;
    }

}
