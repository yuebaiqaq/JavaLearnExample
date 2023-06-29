package com.test.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void linkedListTest(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));

    }
}
