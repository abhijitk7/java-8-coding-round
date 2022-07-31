package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Find Duplicate strings from ArrayList
For example:
List<String> names=Arrays.asList("Ramesh","Abhijit","Suresh","Ganesh","Abhijit","Dinesh","Ramesh");
Output :- Abhijit
 */
public class FindDuplicateFromList {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ramesh","Abhijit","Suresh","Ganesh","Abhijit","Dinesh","Ramesh");
        Set<String> uniqueNames=new HashSet<>();
        System.out.println(names.stream().filter(name->!uniqueNames.add(name)).collect(Collectors.toList()));

    }
}