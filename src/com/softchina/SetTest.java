package com.softchina;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**Set集合的遍历
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class SetTest {
    public static void main(String[] args){
        Set<String> set =new HashSet<>();
        set.add("java");
        set.add("你好");
        set.add("测试");
        set.add("list");
        set.add("的");
        set.add("遍历");
        System.out.println("1.Collection的Iterator迭代器：");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
           System.out.println( it.next());
        }
        System.out.println("2.foreach：");
        for (String str :set) {
            System.out.println(str);
        }
    }
}
