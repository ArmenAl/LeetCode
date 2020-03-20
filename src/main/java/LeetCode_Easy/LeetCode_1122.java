package LeetCode_Easy;

import java.util.Arrays;

public class LeetCode_1122 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};

        relativeSortArray(arr1, arr2);
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;
        Arrays.sort(arr1);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    result[index] = arr2[i];
                    index++;
                }
            }
        }
        // TODO 
        System.out.println(Arrays.toString(result));
        return result;
    }
}
