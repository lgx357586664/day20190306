package com.softchina;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**复习Map集合的三种遍历方式
 * @author: LiGX
 * @Date: 2019/3/6 0006
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(10, "java");
        map.put(14, "hello");
        map.put(5, "world");
        map.put(100, "123");
        // 1.get()和keySet()方法
        System.out.println("1.get()和keySet()方法");
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println("\t" + i + " " + map.get(i));
        }
        // 2.values()方法
        System.out.println("2.values()方法 （只能获得值）");
        Collection<String> values = map.values();
        for (String str : values) {
            System.out.println("\t" + str);
        }
        // 3.entrySet()方法
        System.out.println("3.entrySet()方法");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("\t" + entry.getKey() + " " + entry.getValue());
        }
    }
}
