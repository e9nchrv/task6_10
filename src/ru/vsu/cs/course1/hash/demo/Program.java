package ru.vsu.cs.course1.hash.demo;

import ru.vsu.cs.course1.hash.Pair;
import ru.vsu.cs.course1.hash.SimpleHashMap;

import java.util.Map;


public class Program {

    /**
     * Основная функция программы
     *
     * @param args Параметры командной строки
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Map<Integer, String> m = new SimpleHashMap<>(10);
        m.put(3, "gfgfgf");
        m.put(1, "dsds");
        m.put(2, "cvv");
        Map<Integer, Pair<Object>> m1 = new SimpleHashMap<>(10);
        m1.put(1, new Pair<>("dsds", 122));
        Map<Integer, Integer> m2 = new SimpleHashMap<>(10);
        m2.put(3, 5);
        m2.put(1, 4);
        m2.put(2, 7);

        System.out.println(MapTest.toString(m2, false));
        System.out.println(MapTest.toString(m, false));
        for (Map.Entry<Integer, String> kv: m.entrySet()) {
            System.out.println(kv);
        }
        for (Map.Entry<Integer, Pair<Object>> kv: m1.entrySet()) {
            System.out.println(kv);
        }
    }
}
