package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringProblems {

    // String str = “I am from California”;
    // a in rofi laCmorfmaI
    // 1. Get the positions of the whitespaces
    // 2. Store indexes of whitespaces in a list
    // 3. Take string, remove whitespaces, store in list
    // 4. Reverse string
    // 5. Add whitespaces to list with stored index
    public static String reverseWithSpace(String s) {
        List<Integer> indexList = new ArrayList();
        List<String> stringList = new ArrayList();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                indexList.add(i);
            } else
                stringList.add(s.substring(i, i + 1));
        }

        Collections.reverse(stringList);

        for (Integer i : indexList) {
            stringList.add(i, " ");
        }

        for (String str : stringList) {
            result += str;
        }


        return result;
    }

    public static String secondLargest(String s) {
        String[] arr = s.split(" ");
        String[] sortedArr = new String[arr.length];
        String temp;

//		Arrays.sort(arr); // Have to sort in another way
//		System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        return arr[arr.length - 2];
    }
}
