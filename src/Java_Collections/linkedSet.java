package Java_Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedSet {
    public static void main(String[] args) {

    }


    public static void linkedSet1(){
        //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

    public static void linkedSet2(){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }




}

/*
Constructor	Description
HashSet()	                    It is used to construct a default HashSet.
HashSet(Collection c)	        It is used to initialize the hash set by using the elements of the collection c.
LinkedHashSet(int capacity)	    It is used initialize the capacity of the linked hash set to
                                the given integer value capacity.
LinkedHashSet(int capacity, float fillRatio)	    It is used to initialize both the capacity and
                                                    the fill ratio (also called load capacity)
                                                    of the hash set from its argument.

 */
