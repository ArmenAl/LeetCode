public class Main_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int a = 0; a < nums.length; a++){
            for(int b = a + 1; b < nums.length; b++){
                if(nums[a]+nums[b] == target){
                    return new int[]{a, b};
                }
            }
        }
        return null;
    }
}
