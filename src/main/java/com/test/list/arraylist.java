package com.test.list;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(null);
        list.add("b");

        System.out.println(list.remove(0));




        System.out.println(list);
    }

}
