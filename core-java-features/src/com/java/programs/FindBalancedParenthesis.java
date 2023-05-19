package com.java.programs;

import java.util.ArrayDeque;
import java.util.Deque;

public class FindBalancedParenthesis {
    public static void main(String[] args) {
        String str="[(){}]";
        if(isStringBalanced(str)){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not balanced");
        }

    }

    public static boolean isStringBalanced(String value){
        char[] charArray = value.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (Character param:charArray) {
            if(param=='[' || param=='{' || param=='('){
                stack.push(param);
                continue;
            }

            /* We need to make sure without opening there should not be any closed value */
            if(stack.isEmpty()){
                return false;
            }

            char pop = stack.pop();
            switch (param) {
                case ']' -> {
                    if (pop != '[') {
                        return false;
                    }
                }
                case '}' -> {
                    if (pop != '{')
                        return false;
                }
                case ')' -> {
                    if (pop != '(')
                        return false;
                }

            }
        }


        return stack.isEmpty();
    }
}
