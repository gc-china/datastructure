package com.zerolg.Stack;

import java.util.Stack;

/**
 * @program: Array
 * @description: Solution
 * @author: Gyc
 * @create: 2019-05-23 00:07
 **/
public class Solution {
    Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {

        Solution solution = new Solution();
        boolean isvalid = solution.isvalid("()[]{}");
        System.out.println(isvalid);


    }

    public boolean isvalid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                char pop = stack.pop();


                if (c == ')' && pop != '(')
                    return false;
                if (c == ']' && pop != '[')
                    return false;
                if (c == '}' && pop != '{')
                    return false;
            }
        }


        return stack.isEmpty();
    }
}
