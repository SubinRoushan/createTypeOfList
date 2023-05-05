package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Types of List (Create)

        //IMMUTABLE(Not change Value)
        List<Integer> l1=List.of(1,2,3,4,5);
        System.out.println(l1);

        //MUTABLE(Change Value)
        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.println(l2);

        //IMMUTABLE(Not Change Value)
        List<Integer> l3= Arrays.asList(1,2,3,4,5);
        System.out.println(l3);
    }
}