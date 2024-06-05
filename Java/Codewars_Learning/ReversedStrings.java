package Codewars_Learning;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
    public static String solution(String str) {
        char[] arrByte = str.toCharArray();
        String result = "";
        for(int i = arrByte.length - 1; i >= 0; i--){
            result = result.concat(String.valueOf(arrByte[i]));
        }
        return result;
    }
}
