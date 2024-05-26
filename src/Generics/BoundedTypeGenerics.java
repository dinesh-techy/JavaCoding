package Generics;

public class BoundedTypeGenerics {
    public static <T extends  Comparable<T>> T calculateMinimum(T num1,T num2){
        return num1.compareTo(num2) < 0 ? num1:num2 ;
    }
    public static void main(String[] args) {
        System.out.println("Bounded type Generics....");
        System.out.println(calculateMinimum(10,20));
    }
}
