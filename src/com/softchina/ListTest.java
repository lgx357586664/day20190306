package com.softchina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**list 5种遍历方式
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("java");
        list.add("你好");
        list.add("测试");
        list.add("list");
        list.add("的");
        list.add("遍历");

        // 1.for循环遍历
        System.out.println("1.for循环遍历：");
        System.out.print("\t");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.print("\n");
        // 2.toArray()转化成数组再遍历
        System.out.println("2.toArray()转化成数组再遍历：");
        System.out.print("\t");
        Object[] obj = list.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]);
        }
        System.out.print("\n");
        // 3.Collection的Iterator迭代器
        System.out.println("3.Collection的Iterator迭代器：");
        System.out.print("\t");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.print("\n");
        // 4.List的专属LIstIterator迭代器
        System.out.println("4.List的专属LIstIterator迭代器：");
        System.out.print("\t");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
        System.out.print("\n");
        //5.foreach
        System.out.println("4.foreach：");
        System.out.print("\t");
        for (Object object : list) {
            System.out.print(object);
        }
    }
}

