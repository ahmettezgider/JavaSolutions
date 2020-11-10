package Java_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {

    }

    public static void hashSet1(){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
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

    public static void hashSet2(){
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: "+set);
        //Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: "+set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: "+set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);
    }
}

/*

HashSet class declaration
Let's see the declaration for java.util.HashSet class.

public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
Constructors of Java HashSet class

SN	Constructor	Description
1)	HashSet()	                It is used to construct a default HashSet.
2)	HashSet(int capacity)	    It is used to initialize the capacity of the hash set
                                to the given integer value capacity.
                                The capacity grows automatically as elements are added to the HashSet.
3)	HashSet(int capacity, float loadFactor)	    It is used to initialize the capacity of the hash set
                                                    to the given integer value capacity and the specified load factor.
4)	HashSet(Collection<? extends E> c)	        It is used to initialize the hash set
                                                    by using the elements of the collection c.




Methods of Java HashSet class
SN	Modifier & Type	Method	Description
1)	boolean	add(E e)	            It is used to add the specified element to this set
                                        if it is not already present.
2)	void	clear()	                It is used to remove all of the elements from the set.
3)	object	clone()	                It is used to return a shallow copy of this HashSet instance:
                                        the elements themselves are not cloned.
4)	boolean	contains(Object o)	    It is used to return true if this set contains the specified element.
5)	boolean	isEmpty()	            It is used to return true if this set contains no elements.
6)	Iterator<E>	iterator()	        It is used to return an iterator over the elements in this set.
7)	boolean	remove(Object o)	    It is used to remove the specified element from this set if it is present.
8)	int	size()	                    It is used to return the number of elements in the set.
9)	Spliterator<E>	spliterator()	It is used to create a late-binding and fail-fast Spliterator
                                        over the elements in the set.

 */