package com.test.list;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {


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

    @Test
    public void arrayListRemoveTest(){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(2);
        array.add(1);
        array.add(1);
        array.add(3);
        array.add(3);
        Integer in = 1;
        for (int i = 0; i < array.size(); i++) {
            Integer s = array.get(i);
            if ( s.equals(in) )
            {
                array.remove(s);
                i=i-1;
            }
        }

        System.out.println(array);


    }


}
