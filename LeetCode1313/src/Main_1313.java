import java.util.ArrayList;
import java.util.List;

public class Main_1313 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        decompressRLElist(nums);
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i += 2) {
            int val = nums[i + 1];
            for (int j = 0; j < nums[i]; j++) {
                arr.add(val);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}
