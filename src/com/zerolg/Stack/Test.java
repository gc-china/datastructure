package com.zerolg.Stack;

/**
 * @program: Array
 * @description: 测试栈
 * @author: Gyc
 * @create: 2019-05-22 22:11
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        ArrayStatck<Integer> statck = new ArrayStatck<>();
        for (int i = 0; i < 5; i++) {
            statck.push(i);
        }
        statck.pop();
        Integer peek = statck.peek();
        System.out.println(peek);
        System.out.println(statck);
    }
}
