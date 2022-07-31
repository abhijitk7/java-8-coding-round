package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Find strings and their count of occurrences from ArrayList
For example:
List<String> names=Arrays.asList("Ramesh","Abhijit","Suresh","Ganesh","Abhijit","Dinesh","Ramesh");
Output :- {Abhijit:2},{Ramesh:2},{Suresh:1},{Ganesh:1},{Dinesh:1}
 */
public class FindCountOfDuplicates {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ramesh","Abhijit","Suresh","Ganesh","Abhijit","Dinesh","Ramesh");
        Map<String,Integer> nameMap=new HashMap<>();
        names.stream().forEach(name->nameMap.put(name,(nameMap.getOrDefault(name,0)+1)));
        System.out.println(nameMap);

    }
}
