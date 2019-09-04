package Misc;

import java.util.*;

public class Collection1 {

    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Amit");
        list.add("Kapil");
        list.add("Sachin");
        list.add("Mohit");
        list.add(1, "Swarnim");
        list.add("Nitin");
        list.add(1, "Sachin");
        list.add("Pushkar");
        list.add("Kartik");

        System.out.println("There are total " + list.size() + " elements in array list");
        System.out.println("Elements of array list are:");

        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("Searching result of Mohit in list is:" + list.contains("Mohit"));
        System.out.println("Index of Sachin is:" + list.indexOf("Sachin") + "and" + list.lastIndexOf("Sachin"));
        System.out.println("Remove Amit of array list from end:" + list.remove("Amit"));
        System.out.println("Now traversing arrat list from end:");

        ListIterator li = list.listIterator(list.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}