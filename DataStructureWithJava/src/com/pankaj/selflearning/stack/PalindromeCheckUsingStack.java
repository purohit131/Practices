package com.pankaj.selflearning.stack;

import java.util.LinkedList;

public class PalindromeCheckUsingStack {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abccba"));
        System.out.println(checkPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkPalindrome("I did, did I ?"));
        System.out.println(checkPalindrome("hello"));
        System.out.println(checkPalindrome("Don't nod"));
    }

    public static boolean checkPalindrome(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(str.length());
        String strLower = str.toLowerCase();
        for (int i = 0; i < strLower.length(); i++) {
            char c = strLower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder stringPop = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            stringPop.append(stack.pop());
        }
        return stringNoPunctuation.toString().equals(stringPop.toString());

    }
}
