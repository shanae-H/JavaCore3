package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        //Task 3 question 6 (a
        System.out.println("Display names that start with 'A'");
        memberNames.stream()
                .filter(x->x.startsWith("A") && x.length()>5)
                .forEach(System.out::println);

        //Task 3 question 6 (b
        System.out.println("Sort all names and display them in lower case on the screen");
        memberNames.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        //Task 3 question 7
        //memberNames.stream().toArray().
    }
}
