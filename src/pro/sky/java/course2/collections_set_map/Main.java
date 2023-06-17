package pro.sky.java.course2.collections_set_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));


        System.out.println("Task 1");
        nums.stream().filter(i -> i % 2 == 1).forEach(System.out::println);
        System.out.println();

        System.out.println("Task 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 3, 14, 4, 5, 5, 6, 7, 11, 12, 10, 7, 3, 13, 14, 5 , 2, 2));
        Set<Integer> numsSet = new HashSet<Integer>(nums2);
        numsSet.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println();

        System.out.println("Task 3");
        String kipelov = "Я свободен словно птица в небесах " +
                         "Я свободен я забыл что значит страх " +
                         "Я свободен с диким ветром наравне " +
                         "Я свободен наяву а не во сне ";
        List<String> songWords = Arrays.asList(kipelov.toLowerCase().split(" "));
        System.out.println(songWords);
        Set<String> songWordsSet = new HashSet<>(songWords);
        System.out.println(songWordsSet);

        System.out.println("Task 4");
        List<String> stringsList = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> stringSet = new HashSet<>(stringsList);
        HashMap<String, Integer> frequencyMap = getStringIntegerHashMap(stringsList, stringSet);
        System.out.println(frequencyMap);
        frequencyMap.values().stream().forEach(System.out::println);


    }

    private static HashMap<String, Integer> getStringIntegerHashMap(List<String> strings, Set<String> stringSet) {
        HashMap <String, Integer> frequencyMap = new HashMap<>();
        for (String stringFromSet : stringSet) {
            Integer amount = 0;
            for (String stringFromList : strings) {
                if (stringFromSet.equals(stringFromList)) {
                    amount ++;
                }
            }
            frequencyMap.put(stringFromSet, amount);
        }
        return frequencyMap;
    }
}
