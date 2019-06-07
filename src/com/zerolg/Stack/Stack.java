package com.zerolg.Stack;

public interface Stack<E> {
    /**
     * 获取栈的中的元素个数
     *
     * @return
     */
    int getSize();

    /**
     * 判断栈中有没有这元素
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 添加元素
     **/
    void push(E e) throws Exception;

    /**
     * 取出元素
     **/
    E pop() throws Exception;

    /**
     * 查看栈顶元素
     **/
    E peek() throws Exception;
}
