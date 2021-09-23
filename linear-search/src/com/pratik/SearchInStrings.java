package com.pratik;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "JohnDoe";
        char word = 'J';
        System.out.println(stringSearch(str,word));
    }
    static boolean stringSearch(String str,char target){
        if (str.length() == 0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
//    static boolean stringSearch(String str,char target){
//        if (str.length() == 0){
//            return false;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == target){
//                return true;
//            }
//        }
//        return false;
//    }
}
