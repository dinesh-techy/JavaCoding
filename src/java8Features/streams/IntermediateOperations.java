package java8Features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {
        System.out.println("Intermediate Operations....");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,9,1,2,5);
        squareOfNumber(numbers).forEach(System.out::print);
        findOddNumber(numbers).forEach(System.out::print);
        descendingNumbers(numbers).forEach(System.out::print);
        distinctNumbers(numbers).forEach(System.out::print);
        limitDistinctNumbers(numbers).forEach(System.out::print);
        skipAndSquareNumbers(numbers).forEach(System.out::print);
    }
    //Usage of map
    public static List<Integer> squareOfNumber(List<Integer> numbers){
        System.out.println("\nSquare of numbers....");
       return numbers.stream().map(x->x*x).collect(Collectors.toList());
    }
    //Usage of filter
    public static List<Integer> findOddNumber(List<Integer> numbers){
        System.out.println("\nEven Numbers....");
        return numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
    }
    //Usage of sorted
    public static List<Integer> descendingNumbers(List<Integer> numbers){
        System.out.println("\nDescending Numbers....");
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    //Usage of distinct
    public static List<Integer> distinctNumbers(List<Integer> numbers){
        System.out.println("\nDistinct Numbers....");
        return numbers.stream().distinct().collect(Collectors.toList());
    }
    //Usage of limit
    public static List<Integer> limitDistinctNumbers(List<Integer> numbers){
        System.out.println("\nLimit Distinct Numbers....");
        return numbers.stream().distinct().limit(5).collect(Collectors.toList());
    }
    //Usage of skip
    public static List<Integer> skipAndSquareNumbers(List<Integer> numbers){
        System.out.println("\nSkip and Square Numbers....");
        return numbers.stream().skip(5).map(x->x*x).collect(Collectors.toList());
    }
}
