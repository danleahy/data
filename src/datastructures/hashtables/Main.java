package datastructures.hashtables;

import java.util.*;


public class Main {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
//        List<Integer> duplicates = findDuplicates(nums);
//        System.out.println(duplicates);


        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }


    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);

            if (anagramGroups.containsKey(canonical)) {
                anagramGroups.get(canonical).add(string);
            } else {
                List<String> group = new ArrayList<>();
                group.add(string);
                anagramGroups.put(canonical, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(num, i);
        }

        return new int[]{};
    }


    private static Character firstNonRepeatingChar(String input ) {
        char[] chars = input.toCharArray();

        HashMap<Character, Character> hashMap = new HashMap<>();

        Character temp = null;

        for (int i = 0; i < chars.length ; i++) {

            if (hashMap.containsKey(chars[i])){

                if (i - 2 >= 0) {
                    temp = chars[i - 2];
                    return temp;
                }
            }
            hashMap.put(chars[i],null );

        }
        return temp;
    }

    public static Character firstNonRepeatingChar2(String string) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        return null;
    }


    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashSet<Integer> myHashMap = new HashSet<>();

        for (int i : array1) {
            myHashMap.add(i);
        }

        for (int j : array2) {
            if (myHashMap.contains(j)) return true;
        }

        return false;
    }


}
