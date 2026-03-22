package org.example;

import java.util.*;

public class JavaSyntaxExample {

    public static void main(String[] args) {

        // -----------------------------
        // 1️⃣ ARRAY Example
        // -----------------------------
        System.out.println("---- ARRAY Example ----");

        int[] numbers = {10, 20, 30, 40, 50};

        // Normal for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array element at index " + i + " = " + numbers[i]);
        }


        // -----------------------------
        // 2️⃣ ARRAYLIST Example
        // -----------------------------
        System.out.println("\n---- ARRAYLIST Example ----");

        List<String> fruits = new ArrayList<>();

        // add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // get element
        System.out.println("First fruit: " + fruits.get(0));

        // remove element
        fruits.remove("Banana");

        // enhanced for loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }


        // -----------------------------
        // 3️⃣ LINKEDLIST Example
        // -----------------------------
        System.out.println("\n---- LINKEDLIST Example ----");

        LinkedList<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(200);
        list.add(300);

        // add at first
        list.addFirst(50);

        // add at last
        list.addLast(400);

        // remove element
        list.removeFirst();

        for (Integer num : list) {
            System.out.println("LinkedList value: " + num);
        }


        // -----------------------------
        // 4️⃣ HASHMAP Example
        // -----------------------------
        System.out.println("\n---- HASHMAP Example ----");

        HashMap<Integer, String> students = new HashMap<>();

        // put key-value
        students.put(1, "Amey");
        students.put(2, "Rahul");
        students.put(3, "Priya");

        // get value
        System.out.println("Student with ID 1: " + students.get(1));

        // remove value
        students.remove(2);

        // loop through hashmap
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }


        // -----------------------------
        // 5️⃣ WHILE LOOP Example
        // -----------------------------
        System.out.println("\n---- WHILE LOOP Example ----");

        int count = 0;

        while (count < 3) {
            System.out.println("Count value: " + count);
            count++;
        }


        // -----------------------------
        // 6️⃣ ITERATOR Example
        // -----------------------------
        System.out.println("\n---- ITERATOR Example ----");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Iterator fruit: " + fruit);
        }


        // -----------------------------
        // 7️⃣ IF CONDITION Example
        // -----------------------------
        System.out.println("\n---- IF CONDITION Example ----");

        int number = 25;

        if (number > 20) {
            System.out.println("Number is greater than 20");
        } else {
            System.out.println("Number is less than or equal to 20");
        }


        // -----------------------------
        // 8️⃣ SIMPLE LOGIC Example
        // -----------------------------
        System.out.println("\n---- SIMPLE LOGIC Example ----");

        // Find even numbers in array
        for (int num : numbers) {

            if (num % 2 == 0) {
                System.out.println(num + " is even");
            }

        }

    }
}
