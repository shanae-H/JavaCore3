package coretasks;

import java.util.*;

import static org.testng.AssertJUnit.assertTrue;

public class Task5 {
    public static void main(String[] args) {
        //Task 5 questions 14
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List <String> letters = people.values().stream()
                .flatMap(Collection::stream)
                .filter(x->x.matches("\\D"))
                .toList();
        System.out.println("The following letters were found in the value portion of the people Map structure "+ letters );
        List<String> expected = List.of(new String[]{"a", "d", "s", "z"});
        assertTrue(letters.contains(expected));


        //Pattern pattern = Pattern.compile("\\D");
        // Matcher matcher = pattern.matcher()

        /*
        List<String> listOfLetters = Stream.of(people.values())
                .flatMap(Collection::stream)
                .filter(x->x
                        .anyMatch(
                                (matcher ->pattern.matcher(x.toString()).find()))
                ).toList();
*/
    }
}
