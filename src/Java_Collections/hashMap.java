package Java_Collections;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {

    }


    public static void hashMap1(){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }


    public static void hashMap2(){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void hashMap3(){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        System.out.println("Initial list of elements: "+hm);
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        System.out.println("After invoking put() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(104,"Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }


    public static void hashMap4() {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103, "Gaurav");
        System.out.println("Initial list of elements: "+map);
        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements: "+map);
        //value-based removal
        map.remove(101);
        System.out.println("Updated list of elements: "+map);
        //key-value pair based removal
        map.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+map);
    }


    public static void hashMap5(){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("Initial list of elements:");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(101, "Vijay", "Ravi");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k,v) -> "Ajay");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

}
/*

HashMap class declaration
Let's see the declaration for java.util.HashMap class.

public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
HashMap class Parameters
Let's see the Parameters for java.util.HashMap class.
K: It is the type of keys maintained by this map.
V: It is the type of mapped values.
Constructors of Java HashMap class


Constructor	Description
HashMap()
It is used to construct a default HashMap.

HashMap(Map<? extends K,? extends V> m)
It is used to initialize the hash map by using the elements of the given Map object m.

HashMap(int capacity)
It is used to initializes the capacity of the hash map to the given integer value, capacity.

HashMap(int capacity, float loadFactor)
It is used to initialize both the capacity and load factor of the hash map by using its arguments.



Methods of Java HashMap class
Method	Description
void clear()
It is used to remove all of the mappings from this map.

boolean isEmpty()
It is used to return true if this map contains no key-value mappings.

Object clone()
It is used to return a shallow copy of this HashMap instance: the keys and values themselves are not cloned.

Set entrySet()
It is used to return a collection view of the mappings contained in this map.

Set keySet()
It is used to return a set view of the keys contained in this map.

V put(Object key, Object value)
It is used to insert an entry in the map.

void putAll(Map map)
It is used to insert the specified map in the map.

V putIfAbsent(K key, V value)
It inserts the specified value with the specified key in the map only if it is not already specified.

V remove(Object key)
It is used to delete an entry for the specified key.

boolean remove(Object key, Object value)
It removes the specified values with the associated specified keys from the map.

V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
It is used to compute a mapping for the specified key and its current mapped value
(or null if there is no current mapping).

V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
It is used to compute its value using the given mapping function, if the specified key is not
already associated with a value (or is mapped to null), and enters it into this map unless null.

V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
It is used to compute a new mapping given the key and its current mapped value if the value for
the specified key is present and non-null.

boolean containsValue(Object value)
This method returns true if some value equal to the value exists within the map, else return false.

boolean containsKey(Object key)
This method returns true if some key equal to the key exists within the map, else return false.

boolean equals(Object o)
It is used to compare the specified Object with the Map.

void forEach(BiConsumer<? super K,? super V> action)
It performs the given action for each entry in the map until all entries have been processed or
the action throws an exception.

V get(Object key)
This method returns the object that contains the value associated with the key.

V getOrDefault(Object key, V defaultValue)
It returns the value to which the specified key is mapped, or defaultValue if the map contains
no mapping for the key.

boolean isEmpty()
This method returns true if the map is empty; returns false if it contains at least one key.

V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
If the specified key is not already associated with a value or is associated with null,
associates it with the given non-null value.

V replace(K key, V value)
It replaces the specified value for a specified key.

boolean replace(K key, V oldValue, V newValue)
It replaces the old value with the new value for a specified key.

void replaceAll(BiFunction<? super K,? super V,? extends V> function)
It replaces each entry's value with the result of invoking the given function on that entry
until all entries have been processed or the function throws an exception.

Collection<V> values()
It returns a collection view of the values contained in the map.

int size()
This method returns the number of entries in the map.

 */