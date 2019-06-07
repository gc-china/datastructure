package com.zerolg.Stack;

/**
 * @program: com.zerolg.Array.Array
 * @author: Gyc 数组
 * @create: 2019-05-20 10:12
 **/
public class Array<E> {
    /**
     * 初始数组
     */
    private E[] data;
    //    数组当前个数
    private int size;


    public Array(Integer capaticy) {
        data = (E[]) new Object[capaticy];
        size = 0;
    }

    public Array() {
        //默认10的容量
        this(10);
    }

    /**
     * 获取数组中有多少个容量
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取容量大小
     *
     * @return int
     */
    public int getCapaticy() {
        return data.length;
    }

    /**
     * 判断数组是否为空
     *
     * @return
     */
    public boolean isemply() {
        return size == 0;
    }

    /**
     * 向数组尾部中添加元素
     *
     * @param e
     * @throws Exception
     */
    public void addlist(E e) throws Exception {
       /* if (size == data.length) {
            throw new Exception("数组中没有容量了");
        }
        data[size] = e;
        size++;*/
        add(size, e);
    }

    /**
     * 往头部添加数据
     *
     * @param e
     * @throws Exception
     */
    public void addfrist(E e) throws Exception {
        add(0, e);
    }

    /**
     * 往指定位置添加元素
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) throws Exception {

        if (index < 0 || index > size) {
            throw new Exception("索引应该小于" + size);
        }
        if (size == data.length) {
            resize((int) (data.length * 1.5));
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取指定位置的元素
     *
     * @param index
     * @return
     */
    public E get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("索引不应该小于0和大于" + size);
        }
        return data[index];
    }
//获取第一个元素

    public E getfrist() throws Exception {
        return get(0);
    }

    //获取最后一个元素
    public E getlast() throws Exception {
        return get(size - 1);
    }

    /**
     * 设置指定位置的元素
     *
     * @param index
     * @param e
     * @return
     * @throws Exception
     */
    public void set(int index, E e) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("索引不应该小于0和大于" + size);
        }
        data[index] = e;
    }

    /**
     * 数据中是否存在该元素
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查看该元素索引
     *
     * @param e
     * @return
     */
    public int find(E e) {

        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }

        }
        return -1;
    }

    /**
     * 删除元素
     *
     * @param index
     */
    public E remove(int index) throws Exception {

        if (index < 0 || index > size) {
            throw new Exception("索引应该小于" + size);
        }

        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        if (size <= data.length / 2) {
            resize(data.length / 2);
        }

        size--;
        data[size] = null;
        return data[index];
    }
    //从数组中删除第后元素

    public E removelast() throws Exception {
        remove(size - 1);
        return get(size - 1);
    }

    //从数组中删除第一个元素
    public void removefrist() throws Exception {
        remove(0);
    }

    //从数组中删除元素e
    public void removeElment(E e) throws Exception {
        int i = find(e);
        if (i != -1) {
            remove(i);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Array: size= %d , capacity= %d\n", size, data.length));
        str.append('[');
        for (int i = 0; i < size; i++) {
            str.append(data[i]);
            if (i != size - 1) {
                str.append(",");
            }
        }
        str.append("]");
        return str.toString();
    }

    //    动态扩容
    private void resize(int newCapacity) {
        E[] newdata = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newdata[i] = data[i];
        }
        data = newdata;
    }

}
