package com.test.list;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void arraylistCommonTest(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        System.out.println(list.remove(0));

        System.out.println(list.remove(0));

    }

    @Test
    public void arrayListCloneTest(){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");

        ArrayList<String>l2 = (ArrayList<String>) l1.clone();
        ArrayList<String>l3 = new ArrayList<String>(l1);
        ArrayList<String>l4 = new ArrayList<String>();
        l4.addAll(l1);

        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

    }


}
