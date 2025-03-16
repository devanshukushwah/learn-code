package com.learncode;

import java.util.Stack;

public class StackQuestion {


    static void q1() {
//        Input: "{[()]}"
//        Output: Balanced

//        Input: "{[(])}"
//        Output: Not Balanced

//        String str = "(((())))()()((()))";
        String str = "(())(())";

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (stk.isEmpty()) {
                stk.push(ch);
            } else if (stk.peek() == '(' && ch == ')') {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }
        System.out.println(stk.isEmpty() ? "balanced" : "not balanced");


    }

    public static void main(String[] args) {
        q1();
    }

}
