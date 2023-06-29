package com.test.list;
import java.util.Iterator;
import java.util.LinkedList;
public class linklist {
    public static void main(String[] args) {
       LinkedList l1 = new LinkedList();
       l1.add(null);
       l1.add("b");
       l1.add("c");


       l1.remove("b");



        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
