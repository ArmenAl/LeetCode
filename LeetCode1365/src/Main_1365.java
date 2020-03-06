import java.util.Arrays;
public class Main_1365 {

    public static void main(String[] args) {
        int[] a = {8,1,2,2,3};
        int[] b = {6,5,4,8};
        int[] c = {7,7,7,7};

        smallerNumbersThanCurrent(a);
        smallerNumbersThanCurrent(b);
        smallerNumbersThanCurrent(c);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));

        return res;
    }
}
