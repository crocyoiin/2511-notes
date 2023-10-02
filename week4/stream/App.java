package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // Print out each string ------
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        for (String string : strings) {
            System.out.println(string);
        }

        // Turn each string into an Integer ------
        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println(ints);

        // Remove all odd values from HashMap ------
        Map<String, Integer> map = new HashMap<>(); 
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // FindFirst -----
        List<String> strs = new ArrayList<>(Arrays.asList(new String[] {"one", "two", "three", "four", "five"}));
    }
}