package com.javaguru.teacher.lesson_12.map;

import java.util.HashMap;
import java.util.Map;

class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Integer firstValue = map.put("Ruslan", 20);

        Integer secondTimeValue = map.put("Ruslan", 20);

        map.put("Vasya", 30);
        map.put("Tolik", 50);
        map.put("Anton", 450);

        System.out.println(firstValue);
        System.out.println(secondTimeValue);

        System.out.println(map);

        Integer ruslanValue = map.get("Ruslan");
        System.out.println(ruslanValue);

        Integer abcValue = map.get("abc");
        System.out.println(abcValue);
    }
}
