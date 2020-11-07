package com.javaguru.teacher.lesson_12.map;

import java.util.HashMap;
import java.util.Map;

class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        System.out.println(hashMap.put("Ruslan", 20));
        System.out.println(hashMap);

        System.out.println(hashMap.put("Ruslan", 30));
        System.out.println(hashMap);

        System.out.println(hashMap.put("Ruslan", 40));
        System.out.println(hashMap);

        System.out.println(hashMap.put("Ruslan", 50));
        System.out.println(hashMap);

        System.out.println(hashMap.put("Ruslan", 60));
        System.out.println(hashMap);
    }
}
