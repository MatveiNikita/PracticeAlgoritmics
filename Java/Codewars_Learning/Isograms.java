package Codewars_Learning;

public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }
    public static boolean isIsogram(String str) {
        return !str.toLowerCase().matches(".*(.).*\\1.*");
    }
}
