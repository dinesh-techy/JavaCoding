package Generics;
class Store<T>{
    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}

public class GenericsBasic {
    public static void main(String[] args) {
        System.out.println("Generics basic example");
        Store<String> stringStore = new Store<>();
        stringStore.setItem("RoboStore");
        System.out.println(stringStore.getItem());
        Store<Integer> numberStore = new Store<>();
        numberStore.setItem(100);
        System.out.println(numberStore.getItem());
    }
}
