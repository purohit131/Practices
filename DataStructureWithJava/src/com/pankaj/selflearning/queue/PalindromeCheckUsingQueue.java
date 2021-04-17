package com.pankaj.selflearning.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckUsingQueue {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abccba"));
        System.out.println(checkPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkPalindrome("I did, did I ?"));
        System.out.println(checkPalindrome("hello"));
        System.out.println(checkPalindrome("Don't nod"));
    }

    public static boolean checkPalindrome(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        Queue<Character> queue = new LinkedList<>();
        String strLower = str.toLowerCase();
        for (int i = 0; i < strLower.length(); i++) {
            char c = strLower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.add(c);
                stack.push(c);
            }
        }
        boolean isPalindrome = false;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            isPalindrome = stack.pop().equals(queue.remove());

        }
        return isPalindrome;

    }
}
