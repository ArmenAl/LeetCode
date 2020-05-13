package LeetCode_Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode_763_Partition_Labels {
    public static void main(String[] args) {
        //String S = "ababcbacadefegdehijhklij"; //[9,7,8]
        String S = "qiejxqfnqceocmoymz"; // [13,1,1]
        partitionLabels(S);
    }

    public static List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        HashSet<Character> hashSet = new HashSet<>();
        char s[] = S.toCharArray();
        findString(S, hashSet,s, 0, list);

        return list;
    }


    public static void findString(String myString, HashSet<Character> hashSet, char[] s, int start, List<Integer> list) {
        hashSet.clear();
        char firstChar = s[start];
        int stringLength = myString.lastIndexOf(firstChar);

        for (int i = start; i < stringLength; i++) {
            hashSet.add(s[i]);
        }

        int highest = start;
        for (char c : hashSet) {
            highest = Math.max(myString.lastIndexOf(c), highest);
        }

        hashSet.clear();
        while (highest != stringLength) {
            for (int i = stringLength; i < highest; i++) {
                hashSet.add(s[i]);
            }

           stringLength = highest;
            for (char c : hashSet) {
                highest = Math.max(myString.lastIndexOf(c), highest);
            }

        }

        highest++;
        System.out.println(highest - start);
        list.add(highest - start);

        if (highest >= myString.length()) {
            return;
        }


        findString(myString, hashSet, s, highest, list);
    }

}
