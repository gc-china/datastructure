package com.zerolg.Queue;

/**
 * @Author Gyc
 * @Description //队列
 * @Da«te 10:18 2019-05-23
 **/
public interface Queue<E> {
    /**
     * 获取队列中的元素个数
     **/
    int Size();

    /**
     * 判断队列中的是否有
     **/

    boolean isEmpty();

    /**
     * 取出队列最后个元素
     **/

    E dequeue() throws Exception;

    /**
     * 获取队列以一个元素
     **/
    E getFront() throws Exception;

}
