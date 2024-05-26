package Generics;

public class GenericMethod {
    public <T> void printName(T item){
        System.out.println("Prints from a generic method printName..."+item.toString());
    }
    public <K,V> String getAge(K key,V value){
      return key+" age is "+value;
    }
    public static void main(String[] args) {
        System.out.println("Generic method...");
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printName("Dinesh");
        System.out.println(genericMethod.getAge("Dinesh",24));
    }
}
