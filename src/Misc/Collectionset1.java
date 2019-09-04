package Misc;

import java.util.*;

public class Collectionset1 {

    public static void main(String ar[]) {

        HashSet hs = new HashSet();
        hs.add("Amit");
        hs.add("Sachin");
        hs.add("Nitin");
        hs.add("Pushkar");
        hs.add("Kapil");
        hs.add("Amit");
        hs.add("Kamal");
        hs.add("Mohit");

        System.out.println("There are total " + hs.size() + " elements in hashset");
        System.out.println("Elements of hashset are:");

        Iterator itr = hs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("Searching Amit in hashset is:" + hs.contains("Amit"));
        System.out.println("Adding all elements of hashset into tree set");

        TreeSet ts = new TreeSet();
        ts.addAll(hs);
        System.out.println("Size of treeset is:" + ts.size());
        System.out.println("Elements of treeset are:");

        Iterator it = ts.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

}