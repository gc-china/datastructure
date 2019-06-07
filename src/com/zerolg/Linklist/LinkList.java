package com.zerolg.Linklist;

/**
 * @program: Array
 * @description: 用java 实现链表
 * @author: Gyc
 * @create: 2019-05-25 11:24
 **/
public class LinkList<E> {
    private int size;
    private Node head;

    public LinkList() {
        head = null;
        size = 0;
    }

    /**
     * 获取链表的元素个数
     **/
    public int getSize() {
        return size;
    }

    /**
     * 判断链表是否为空
     **/

    public boolean isEmpty() {
        return size != 0;
    }

    /**
     * 向链表头添加元素
     **/
    public void addFrist(E e) {
        Node node = new Node(e);
        node.next = head;
        head = node;
        size++;
    }

    /**
     * 在index在中添加一个元素
     **/
    public void add(int index, E e) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("索引错了");
        }
        if (index == 0) {
            addFrist(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            size++;

        }

    }
    /**在尾部添加元素**/
public  void  addlist(E e) throws Exception {
        add(size, e);
}
    //    链表的内部节点
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
