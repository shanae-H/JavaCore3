package coretasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main (String[] args){
        //Task 1.1
        System.out.println("Show in console the stream of integers");
        Stream <Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);

        //Task 1.2
        System.out.println("Generate 20 random numbers");
       List <Integer> randomNumbers = Stream.generate(new Random()::nextInt)
               .limit(20).toList();
       System.out.println(randomNumbers);

       //Task 1.3
        System.out.println("Convert list elements to stream, select the even numbers and collect method using List");
        List <Integer> evenRandomNumbers = randomNumbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        evenRandomNumbers.forEach(System.out::println);





    }

}
