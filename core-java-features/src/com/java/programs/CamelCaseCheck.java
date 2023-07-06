package com.java.programs;

public class CamelCaseCheck {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(isCamelCase(str));
    }

    private static boolean isCamelCase(String str) {
        if(str.isEmpty() || str.isBlank()){
            return false;
        }
        else {
            String[] strings = str.split(" ");
            for (String s : strings) {
                if (!isCamel(s)) {
                    return false;
                }
            }
            return true;
        }
    }

    private static boolean isCamel(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
