package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //Task 2 question 4
        System.out.println("Collect stream elements as an Array");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);
        Integer[] arrayOfIntegers =list.stream()
                .filter(x->x % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arrayOfIntegers));

        //Task 2 question 5
        System.out.println("Filter words that start with C, covert to uppercase and sort in descending order");
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        //Stream<String> filteredSortedList =
        myList.stream()
                .filter(x->x.startsWith("c"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
