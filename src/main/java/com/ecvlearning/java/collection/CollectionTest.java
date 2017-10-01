package com.ecvlearning.java.collection;

import java.util.*;

public class CollectionTest {
    private void printList(List list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] arsg){
        CollectionTest ct = new CollectionTest();

        List list = new ArrayList();
//        List list = new LinkedList();
        list.add("first element");
        list.add(0,"Zero element");
        list.add("second element");
        ct.printList(list);

        System.out.println(list.contains("first element"));

        System.out.println();

//        list.remove("first element");
        list.remove(1);

        ct.printList(list);

        System.out.println(list.contains("first element"));
        System.out.println(list.indexOf("second element"));

        System.out.println();

        Map map = new HashMap();
        map.put("0","Zero element");
        map.put(1,"First element");
        map.put(2,"Second element");

        System.out.println(map.get("0"));
        System.out.println(map.get(0));
        System.out.println(map.get(1));

        map.put(1,"1esdfdfasewf");
        System.out.println(map.get(1));
        System.out.println(map.size());

        Set entries = map.entrySet();
        Iterator it = entries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
