package java8Features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
        System.out.println("Terminal Operation....");
        List<String> names = Arrays.asList("Apple","Orange","PineApple","Masombi");
        printNames(names);
        countNames(names);
        minMaxNames(names);
        longestString(names);
    }
    //for-each usage
    public static void printNames(List<String> names){
        names.stream().forEach(System.out::print);
    }
    //count names usage
    public static void countNames(List<String> names){
        int count = (int) names.stream().filter(name -> name.length()>5).count();
        System.out.println("\nCount of Names...."+count);
    }
    //min max
    public static void minMaxNames(List<String> names){
        String minName = String.valueOf(names.stream().min(Comparator.comparing(String::length)));
        String maxName = String.valueOf(names.stream().max(Comparator.comparing(String::length)));
        System.out.println(minName);
        System.out.println(maxName);
    }
    // reduce
    public static void longestString(List<String> names){
       String longestString = names.stream().reduce((name1,name2)->name1.length()>name2.length()?name1:name2).toString();
       System.out.println(longestString);
    }
}
