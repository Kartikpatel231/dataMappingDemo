package com.datamappings.datamapping;
//HashMap simple get value and find key program
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();

        obj.put("Java_", 10);
        obj.put("Core_", 30);
        obj.put("Tricks", 20);

        System.out.println((obj));
        System.out.println("Size of hasmap is:- " + obj.size());
        if (obj.containsKey("Java_")) {
            Integer a = obj.get("Java_");

            System.out.println("value for key"
                    + " \"Java\" is:- " + a);

        }
    }
}