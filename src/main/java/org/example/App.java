package org.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        System.out.println("List\r\n");
        ArrayList < String > names = new ArrayList < String > ();
        names.add("Brandon");
        names.add("John");
        names.add("Neil");
        names.add("Caleb");
        names.set(0, "Justin");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


        System.out.println("\nMap\r\n");
        Map < String, Integer > students = new HashMap < > ();

        students.put("Brandon", 4);
        students.put("John", 2);
        students.put("Neil", 4);
        students.put("Caleb", 1);

        System.out.print("Total Students: " + students.size());
        for (String key: students.keySet()) {

            System.out.println(key + " - " + students.get(key));
        }
        String searchKey = "Caleb";
        if (students.containsKey(searchKey)) {
            System.out.println("Found total " + students.get(searchKey) + " " + searchKey + " students!\n");
        }
        students.clear();
        System.out.println("After clear operation, size: " + students.size());

        System.out.println("\nSet\r\n");
        Set < String > hash_Set = new HashSet < String > ();
        hash_Set.add("Brandon");
        hash_Set.add("Neil");
        hash_Set.add("Brandon");
        hash_Set.add("John");
        hash_Set.add("Caleb");

        System.out.print("Set output without the duplicates");
        System.out.println(hash_Set);




    }
}