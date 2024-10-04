package Task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        //Task 4 question 11
        System.out.println("Concatenate 3 arrays");
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<Integer> concatList = Stream.of(list1, list2, list3)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("The new concatenated list is as follows: "+ concatList);

        //Task 4 question 11 (part 2)
        System.out.println("\n\nCombine the the 2d string array into 1d array");
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        String [] concatArray = Stream.of(dataArray)
                .flatMap(x-> Arrays.stream(x))
                .toArray(String[]::new);
        System.out.println("The new concatenated array is as follows: "+ Arrays.toString(concatArray));

        //Task 4 question 12
        System.out.println("\n\nRemove the duplicates from the array and print to screen");
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
        System.out.println(numbersList);
        ArrayList<Integer> uniqueNumbersList = numbersList.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Duplicates removed. The new unique array of numbers is as follows "+ uniqueNumbersList);

        //Task 4 question 13
        //Map<Integer,Integer> myCollection = Stream.of(numbersList).collect(Collectors.toMap());


    }
}
