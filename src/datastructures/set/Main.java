package datastructures.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {



    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */

    }

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> mySet = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int num : arr1) {
            mySet.add(num);
        }

        for (int num : arr2) {
            int complement = target - num;
            if (mySet.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
        }

        return pairs;
    }

    private static boolean hasUniqueChars(String input) {
        Set<Character> characterSet = new HashSet<>();
         char[] chars   = input.toCharArray();

        for (char aChar : chars) {
            if (characterSet.contains(aChar)) return false;
            characterSet.add(aChar);
        }
        return true;
    }

    private static List<Integer> removeDuplicates(List<Integer> myList) {
        HashSet<Integer> temp = new HashSet<>();

        temp.addAll(myList);

        List<Integer> arr;

        return new ArrayList<>(temp);
    }

    private static List<Integer> removeDuplicates2(List<Integer> myList) {
        HashSet<Integer> temp = new HashSet<>();

        temp.addAll(myList);

        List<Integer> arr;

        return List.copyOf(temp);
    }

    private static List<Integer> removeDuplicates3(List<Integer> myList) {

        return new HashSet<>(myList).stream().toList();
    }

    private static List<Integer> removeDuplicates4(List<Integer> myList) {

        HashSet<Integer> temp = new HashSet<>();

        temp.addAll(myList);

        return temp.stream().collect(Collectors.toCollection(ArrayList::new));
    }

}

