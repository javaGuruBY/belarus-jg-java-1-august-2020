package com.javaguru.teacher.lesson_12.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class HashCodeExamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<PersonKey, String> map = new HashMap<>();

        System.out.println("Please enter first name:");
        String name = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter description:");
        String description = scanner.nextLine();

        PersonKey firstKey = new PersonKey(name, lastName);
        map.put(firstKey, description);

        System.out.println(map);

        System.out.println("Find your description: ");

        System.out.println("Please enter first name:");
        String name1 = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName1 = scanner.nextLine();

        String firstPersonValue = map.get(new PersonKey(name1, lastName1));
        System.out.println("Your description = " + firstPersonValue);
    }
}
