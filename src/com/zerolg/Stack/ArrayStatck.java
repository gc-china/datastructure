package com.zerolg.Stack;

/**
 * @program: Array
 * @description: 基于数组实现栈
 * @author: Gyc
 * @create: 2019-05-22 21:38
 **/
public class ArrayStatck<E> implements Stack<E> {

    Array<E> array;

    public ArrayStatck(int capacity) {
        super();
        array = new Array<>(capacity);
    }

    ArrayStatck() {
        array = new Array<>();
    }

    /**
     * 获取栈中多少元素
     **/
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * 获取栈中是否存在元素
     **/

    @Override
    public boolean isEmpty() {
        return array.isemply();
    }

    /**
     * 添加元素
     *
     * @param e
     */
    @Override
    public void push(E e) throws Exception {
        array.addlist(e);
    }

    /**
     * 查看栈容量
     **/
    public int getCapacity() {
        return array.getCapaticy();
    }

    /**
     * 取出元素
     **/
    @Override
    public E pop() throws Exception {
        return array.removelast();
    }

    /**
     * 查看栈顶元素
     **/
    @Override
    public E peek() throws Exception {
        return array.getlast();

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Stack");
        str.append('[');
        for (int i = 0; i < array.getSize(); i++) {
            try {
                str.append(array.get(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i != array.getSize() - 1) {
                str.append(",");
            }

        }
        str.append("] top");
        return str.toString();
    }
}