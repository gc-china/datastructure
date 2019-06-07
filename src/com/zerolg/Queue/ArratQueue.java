package com.zerolg.Queue;

/**
 * @program: Array
 * @description: 数组实现队列
 * @author: Gyc
 * @create: 2019-05-23 10:35
 **/
public class ArratQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArratQueue() {
        array = new Array<>();
    }

    public ArratQueue(int capaticy) {
        array = new Array<>(capaticy);
    }

    /**
     * 获取队列中的元素个数
     **/
    @Override
    public int Size() {
        return array.getSize();
    }

    /**
     * 判断队列中的是否有
     **/
    @Override
    public boolean isEmpty() {
        return array.isemply();
    }

    /**
     * 取出队列最后个元素
     **/
    @Override
    public E dequeue() throws Exception {
        return array.removelast();
    }

    /**
     * 获取队列以一个元素
     **/
    @Override
    public E getFront() throws Exception {
        return array.getfrist();
    }


    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Queue");
        str.append("Front[");
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
        str.append("] tail");
        return str.toString();
    }
}
