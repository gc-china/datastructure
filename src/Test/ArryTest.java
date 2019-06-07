package Test;

import com.zerolg.Array.Array;

/**
 * @program: com.zerolg.Array.Array
 * @description: 测试
 * @author: Gyc
 * @create: 2019-05-20 10:45
 **/
public class ArryTest {
    public static void main(String[] args) throws Exception {
        Array array = new Array();
        for (int i = 0; i < 3; i++) {
            array.addlist("张三"+i);
        }

        array.remove(1);
        array.removeElment(0);
        System.out.println("array.find(10) = " + array.find(10));
        System.out.println("array = " + array);
    }
}
