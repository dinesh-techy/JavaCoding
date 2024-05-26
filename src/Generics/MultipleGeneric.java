package Generics;

import java.util.Arrays;

class HashTable<K,V>{
    private K key;
    private V value;
    public HashTable(K key,V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class MultipleGeneric {
    public static void main(String[] args) {
        System.out.println("Multiple Generics");
        HashTable<Integer,String> student1 = new HashTable<>(1,"Dinesh");
        System.out.println(student1.toString());
    }
}
