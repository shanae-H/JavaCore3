package coretasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

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
        System.out.println("\n\nSort all names and display them in lower case on the screen");
        memberNames.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        //Task 3 question 7
        System.out.println("\n\nFrom task 6, take an array and check with anyMatch or allMatch to find names that contain S");
        boolean sPresent = memberNames.stream()
                .anyMatch(x->x.contains("S"));
        assertEquals(true,sPresent);
        System.out.println("The list of member names contains the letter S. "+ sPresent);

        System.out.println("\n\nFrom Task 6, take an array and check with noneMatch that the list contains names with the letter H");
        boolean hIsPresent = memberNames.stream()
                .noneMatch(x-> x.contains("H"));
        assertEquals(true,hIsPresent);
        System.out.println("None of member names in the list contains the letter H. "+ hIsPresent);

        //Task 3 question 8
        System.out.println("Total number of members are "+ memberNames.stream().count());

        //Task 3 question 9
        long numOfNamesWithA = memberNames.stream()
                .filter(x->x.startsWith("A"))
                .count();
        System.out.println("There are "+ numOfNamesWithA +" names that begin with the letter A");

        //Task 3 question 10
        String nameBeginsWithL = memberNames.stream()
                .filter(x-> x.startsWith("L"))
                .findFirst()
                .orElse("No names found beginning with L");
        System.out.println("The first name that begins with L is: "+ nameBeginsWithL);

    }
}
